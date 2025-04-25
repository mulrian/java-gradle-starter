# Java Gradle Starter

This is a minimal Java project template using [Gradle](https://gradle.org/) to manage dependencies and build/test/deploy:

- [conventional](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) baseline Java project structure
- using [Gradle wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper_basics.html) - no need to install Gradle globally
- [JUnit](https://junit.org/junit5/) dependencies with example test
- package into [shadow](https://gradleup.com/shadow/) (fat jar) for easy deployment

## 💻 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/mulrian/java-gradle-starter.git
cd java-gradle-starter
```

### 2. Rename the Project

Update the `rootProject.name` in [`settings.gradle.kts`](settings.gradle.kts):

```groovy
rootProject.name = 'your-project-name'
```

You can also rename the folder and update the package structure under `src/main/java`.

---

## 📥 Importing into Your IDE

Most IDEs will detect the Gradle project automatically:

- **IntelliJ IDEA**: `File` → `Open` → select project folder. IntelliJ will auto-detect and import the Gradle project.
- **VS Code**: Install the [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack), then open the folder and hope for the best.
- **Eclipse**: Install the Buildship Gradle plugin, then `File` → `Import` → `Gradle → Existing Gradle Project`.

---

## 🔧 Adding Dependencies

Project pages often include coordinates for how to add include them as a dependency. Alternatively go to e.g. <https://mvnrepository.com/> or <https://central.sonatype.com/> to lookup something specific.
For example Jackson at <https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind>. Select a version and it will give you the snippet to use.

To add new external libraries, modify the `dependencies` block in [`build.gradle.kts`](build.gradle.kts):

```kotlin
dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.3")
}
```

Afterward you will need get Gradle to pull down the files. In IntelliJ go the Gradle panel on the right side and press the `Sync` (refresh) button.
Alternatively you can just rebuild your project shown below.

---

## 🛠️ Build and Test the Project

Use the Gradle wrapper to build the project. This will compile the code and run tests. 
You can see the compiled class files in `build/classes` and generated artifacts will be created in `build/libs` 
(note that these JAR files won't include dependencies or be directly executable, although you can use the generated scripts to run them).

```bash
./gradlew build
```

To execute only the tests (or run through your IDE directly):

```bash
./gradlew test
```

---

## 🎯 Running the App

You can also get Gradle to run your app if needed. It will look for a main method in the class defined in the `application->mainClass` property.
This will also be the class run by the executable JAR created in the next step.

```bash
./gradlew run
```

---

## 📦 Creating a Shadow/Fat JAR

This template includes the [Shadow plugin](https://gradleup.com/shadow/), which packages all dependencies into a single executable JAR (also
sometimes known as a fat jar).

To build the shadow JAR:

```bash
./gradlew shadowJar
```

The output will be in:

```
build/libs/your-project-name-all.jar
```

---

## 🚀 Running the JAR

Since you now have just a single file with everything bundled in, to deploy or run your app you can just execute the JAR directly:

```bash
java -jar build/libs/your-project-name-all.jar
```
