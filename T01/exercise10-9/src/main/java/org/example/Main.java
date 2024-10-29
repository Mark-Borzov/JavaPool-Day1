package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int stringCount = scanner.nextInt();
        scanner.nextLine();
        fillingArrayList(arrayList, stringCount, scanner);
        String substring = scanner.nextLine();
        filtering(arrayList, substring);
    }

    // Данный метод заполняет ArrayList:
    public static void fillingArrayList(ArrayList<String> arrayList, int stringCount, Scanner scanner) {
        for (int i = 0; i < stringCount; i++) {
            String string = scanner.nextLine();
            arrayList.add(string);
        }
    }

    // Данный метод фильтрует список строк arrayList по подстроке substring и формирует конечную строку:
    public static void filtering(ArrayList<String> arrayList, String substring) {
        ArrayList<String> resultList = new ArrayList<>();
        for (String element : arrayList) {
            if (substring(element, substring)) {
                resultList.add(element);
            }
        }
        if (!(resultList.isEmpty())) {
            StringBuilder resultString = new StringBuilder();
            for (int i = 0; i < resultList.size(); i++) {
                resultString.append(resultList.get(i));
                if (i < resultList.size() - 1) {
                    resultString.append(", ");
                }
            }
            String result = resultString.toString();
            System.out.println(result);
        }
    }

    // Данный метод ищет подстроку в строке:
    public static boolean substring(String string, String substring) {
        int stringLength = string.length();
        int substringLength = substring.length();
        for (int i = 0; i <= stringLength - substringLength; i++) {
            int j;
            for (j = 0; j < substringLength; j++) {
                if (string.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }
            if (j == substringLength) {
                return true;
            }
        }
        return false;
    }
}