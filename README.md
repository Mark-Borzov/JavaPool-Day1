# Java Pool Day1 

Каждая задача оформлена в качестве отдельного проекта в директории `T01`. Например, `T01/exerciseN-1`, где *N* количество задач.

## Задание 1. Нахождение периметра треугольника
Разработай математический модуль, который определяет периметр треугольника.

- Программа считывает координаты вершин треугольника. 
- Программа работает с вещественными числами.
- Программа вычисляет и выводит периметр треугольника, если из введенных вершин образуется треугольник.
- Если из введенных вершин не образуется треугольник, то программа выводит: «It isn't triangle».
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Точность: 3 знака после запятой.
- Используй только простые типы.

## Задание 2. Нахождение часов, минут и секунд
Разработай математический модуль, который переводит секунды к формату hh:mm:ss находит, то есть находит количество часов, минут и секунд.

- Программа считывает секунды. 
- Программа работает с целыми числами.
- Программа вычисляет и выводит количество часов, минут и секунд в формате hh:mm:ss.
- Если введено количество секунд меньше 0, то должно выводиться: «Incorrect time».
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Должна быть следующая структура программы:
  - метод ввода;
  - метод нахождения часов, минут и секунд;
  - метод вывода;
  - все упомянутые выше методы должны вызываться из main.
- Используй только простые типы.

## Задание 3. Поиск числа Фибоначчи
Разработай математический модуль, который находит n число Фибоначчи.

- Программа считывает порядковый номер числа Фибоначчи. 
- Программа работает с целыми числами.
- Предусмотреть выход за пределы памяти.
- Для нахождения числа Фибоначчи используй рекурсивный подход.
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Используй только простые типы.

## Задание 4. Поиск среднего арифметического отрицательных чисел
Разработай математический модуль, который находит среднее арифметическое отрицательных чисел.

- Программа считывает количество чисел. 
- Программа считывает каждое новое число в массив.
- Программа работает с целыми числами.
- Если отрицательные числа есть, то должно выводиться их среднее арифметическое, иначе: «There are no negative elements».
- Если введено отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0».
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Применяй цикл с предусловием for.
- Используй только простые типы.

## Задание 5. Поиск чисел, у которых совпадает первая и последняя цифра
Разработай математический модуль, ищущий числа, у которых совпадает первая и последняя цифра.

- Программа считывает количество чисел. 
- Программа считывает каждое новое число в массив.
- Программа работает с целыми числами.
- Если есть числа, у которых совпадает первая и последняя цифра, то должно выводиться их, иначе: «There are no such elements».
- Числа, у которых совпадает первая и последняя цифра, сохранить в отдельный массив.
- Если введено отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0».
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Используй цикл с предусловием while.
- Должен быть выделен отдельный метод для определения числа, у которого совпадает первая и последняя цифра.
- Используй только простые типы.

## Задание 6. Сортировка массива выбором
Разработай математический модуль, который производит сортировку массива выбором по возрастанию.

- Программа считывает количество чисел. 
- Программа считывает каждое новое число в массив.
- Программа работает с вещественными числами.
- Программа выводит отсортированный массив выбором по возрастанию.
- Если введено отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0»
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Должен быть выделен отдельный метод для сортировки выбором массива по возрастанию.
- Нельзя использовать библиотечные реализации, нужно написать свою.
- Используй только простые типы.

## Задание 7. Поиск максимального и минимального значений
Разработай математический модуль, который производит поиск максимального и минимального значений в массиве.

- Программа считывает путь до файла.
- Программа считывает из файла количество чисел. 
- Программа считывает каждое новое число из файла в массив, пока не превысит количество чисел, либо не достигнет конца файла.
- Программа работает с вещественными числами.
- Программа выводит считанное количество чисел и сами числа.
- Программа сохраняет в файл «result.txt» найденные минимум и максимум и выводит в консоль сообщение: «Saving min and max values in file».
- Если считалось чисел меньше, чем указано в количестве, должно выводиться: «Input error. Insufficient number of elements».
- Если файла не существует, то должно выводиться: «Input error. File isn't exist».
- Если отрицательное количество чисел или ноль, то должно выводиться: «Input error. Size <= 0».
- Программа не завершается с ошибкой при некорректных входных данных. Она пропускает ошибочный ввод и переходит к следующему считыванию значения.

## Задание 8. Упорядоченная последовательность по возрастанию
Разработай математический модуль, который определяет, является ли последовательность упорядоченной по возрастанию.

- Программа считывает каждое новое число.
- Программа работает с целыми числами.
- Нельзя использовать массивы.
- Программа должна определить, является ли последовательность упорядоченной по возрастанию. В случае отрицательного ответа определить порядковый номер первого числа, нарушающего такую упорядоченность, должно выводиться: «The sequence is not ordered from the ordinal number of the number (порядковый номер)».
- Программа завершает проверку введенной последовательности при некорректном вводе и выводит: «The sequence is ordered in ascending order», если было введено хотя бы одно число.
- Если не ввели ни одного числа, то должно выводиться: «Input error».
- Используй только простые типы.

## Задание 9. Фильтрация строк
Разработай модуль, который фильтрует список строк по подстроке.

- Программа считывает количество строк.
- Программа считывает каждую новую строку в список.
- После считывания всех строк программе на вход подается подстрока для фильтрации.
- Программа работает со ссылочными типами данных (List, String, Integer и т. д.).
- Программа должна вывести список строк, в которых присутствует введенная подстрока.
- Нельзя использовать Java Stream API.
- Должна быть своя реализация метода фильтрации.

## Задание 10. Поиск имен совершеннолетних пользователей

Разработай модуль, который ищет имена совершеннолетних пользователей.

- Создай класс User с двумя полями: строка с именем пользователя, целочисленный возраст.
- Класс User должен быть в отдельном файле.
- Программа считывает количество пользователей.
- Каждый считанный пользователь добавляется в список.
- Если ввели отрицательный или нулевой возраст, то программа выводит: «Incorrect input. Age <= 0» и переходит к следующему вводу.
- Программа не завершается с ошибкой при некорректных входных данных. Она выводит: «Couldn't parse a number. Please, try again» и повторяет попытку ввода.
- Программа должна вывести имена совершеннолетних пользователей.
- Должно использоваться Java Stream API.
- Программа работает со ссылочными типами данных.
