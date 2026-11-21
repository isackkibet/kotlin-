# Kotlin Challenge

A step-by-step Kotlin/JVM learning project: a Student Management System built in small stages.

## Current stage

Stage 1 focuses on Kotlin fundamentals and an interactive challenge:

- `val` and `var`
- basic data types: `String`, `Int`, `Double`, `Boolean`
- operators and string templates
- console input with `readln()`
- `if`/`else`, `when`, `while`
- functions, parameters and return types
- validation using `toIntOrNull()`

A bonus console quiz covers all 15 Jetpack Compose vocabulary items below. These are Compose APIs, not core Kotlin keywords. No Android SDK or Compose UI runtime is used yet.

| You want to...               | Use              |
|------------------------------|------------------|
| Declare a Compose UI function | `@Composable`    |
| Display words                | `Text()`         |
| Create a button              | `Button()`       |
| Allow typing                 | `TextField()`    |
| Arrange vertically           | `Column()`       |
| Arrange horizontally         | `Row()`          |
| Overlay components           | `Box()`          |
| Display pictures             | `Image()`        |
| Display symbols              | `Icon()`         |
| Show many records            | `LazyColumn()`   |
| Remember screen data         | `remember`       |
| Track changing data          | `mutableStateOf()` |
| Style components             | `Modifier`       |
| Structure a screen           | `Scaffold()`     |
| Move between screens         | `NavHost()`      |

## Project structure

```text
src/main/kotlin/com/studentmanagement/
  Main.kt                  entry point
  Basics.kt                Stage 1 warm-up: name, age, menu
  Challenge.kt             Stage 1 quiz with hints and score
  ComposeVocabulary.kt     Compose API vocabulary quiz and cheat sheet
  Input.kt                 shared input helpers
  StageOneExercises.kt     practice stubs using TODO(...)
src/test/kotlin/com/studentmanagement/   reserved for unit tests
stages/                                  reserved for stage notes
```

## Requirements

- JDK 17 or newer (JDK 21 recommended)
- Kotlin compiler (`kotlinc`) 1.9 or newer
- VS Code with the Kotlin extension (optional)

These tools are not bundled in this repository.

## Build and run

From the project root:

```powershell
kotlinc src/main/kotlin/com/studentmanagement -include-runtime -d student-management.jar
java -jar student-management.jar
```

## Exercises

Replace each `TODO(...)` in `StageOneExercises.kt`:

1. Convert Celsius to Fahrenheit.
2. Describe a number as negative, zero or positive using `when`.
3. Repeat text using a `for` loop.
4. Use a default argument and a string template in a greeting.

Answers are intentionally not included. Attempt them first, then compare with your mentor.

## Roadmap

- Stage 2: functions with default/named arguments, lists, mutable lists and the `Student` model
- Stage 3: sets, maps, arrays and collection operations
- Stage 4: classes, data classes, constructors, encapsulation and inheritance
- Stage 5: interfaces, null safety, sealed classes and enums
- Stage 6: exceptions, lambdas, higher-order functions, extension functions and scope functions
- Stage 7: file handling, save/load and unit tests
