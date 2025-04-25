plugins {
    application
    id("java")
    id("com.gradleup.shadow") version "8.3.6"
}

group = "com.example.myapp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("com.example.myapp.Main")
}
