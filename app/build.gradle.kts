plugins {
    // Apply the Java plugin for compiling Java code
    java
    // Apply the application plugin to add support for building an application
    application
}

group = "org.example"
version = "1.0"

repositories {
    mavenCentral() // Configures Maven Central for dependencies
}

dependencies {
    // Define dependencies using Kotlin DSL syntax. Use JUnit Jupiter (JUnit 5) for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    // If using parameterized tests
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")
}

application {
    mainClass.set("org.example.App") // Specifies the main class
}

// A custom task example using Kotlin DSL
tasks.register("hello") {
    doLast {
        println("Hello, Gradle with Kotlin DSL!")
    }
}
