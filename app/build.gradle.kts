plugins {
    java
    application
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")
}

application {
    mainClass.set("org.example.App")
}

tasks.register("hello") {
    doLast {
        println("Hello, Gradle with Kotlin DSL!")
    }
}
