plugins {
    id("java")
    id("application")
}

application {
    mainClass = "org.example.Main"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

// Настройка создания JAR-файла
tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "org.example.Main"
        )
    }
    archiveFileName.set("exercise10-7.jar")
    destinationDirectory.set(file("${projectDir}"))
}

// Удаляем JAR-файл при выполнении clean
tasks.clean {
    delete("${projectDir}/exercise10-7.jar")
}

// Запуск jarНика: java -jar exercise10-7.jar