# Kotlin Challenge

This is my own Kotlin challenge. I am building a Student Management System one small stage at a time, and I am trying to actually understand the code instead of just letting AI write it for me.

So the rule is simple: no using AI as a shortcut. I read the code, type the exercises myself, run it, break it, and then fix it. If something does not make sense, I go back and read the file again before asking for help. That is the whole point of this repo.

Right now it is only a console app. No database, no fancy framework, no magic. Just Kotlin, the JVM and a few small files.

## What stage 1 covers

In this stage I am playing with:

- `val` and `var`, and why I should reach for `val` first
- basic types like `String`, `Int`, `Double` and `Boolean`
- operators, ranges and string templates
- reading input from the keyboard with `readln()`
- `if`/`else`, `when` and `while`
- functions, parameters and return types
- checking input with `toIntOrNull()`

The quiz files are there to test me, not just to look nice. If I get a question wrong, I read the hint and try again.

## How I use this repo

1. Open the stage file and read it slowly.
2. Type the exercise myself in `StageOneExercises.kt`.
3. Run the app and see what happens.
4. Read the error properly instead of panicking.
5. Fix one thing at a time.
6. Only after trying, check the hint or ask for help.

I am not in a hurry. Understanding one small thing properly is better than copying ten things I cannot explain.

## Project structure

```text
src/main/kotlin/com/studentmanagement/
  Main.kt                  entry point
  Basics.kt                warm-up: name, age and a small menu
  Challenge.kt             quiz with hints and a score
  ComposeVocabulary.kt     Compose vocabulary quiz
  Input.kt                 shared input helpers
  StageOneExercises.kt     my practice stubs using TODO(...)

src/test/kotlin/com/studentmanagement/   for tests later
stages/                                  notes for later stages
compose-showcase/                        separate Compose reference, not part of the console build
```

## What I need to run it

- JDK 17 or newer (I prefer JDK 21)
- Kotlin compiler (`kotlinc`), version 1.9 or newer
- VS Code with the Kotlin extension is nice, but not required

These tools are not inside this repo. I need to have them on my machine first.

## Running it

From the project root:

```powershell
kotlinc src/main/kotlin/com/studentmanagement -include-runtime -d student-management.jar
java -jar student-management.jar
```

If that fails, I check two things first: is Java installed, and is `kotlinc` on my PATH?

## Exercises

I have not written the answers here on purpose.

In `StageOneExercises.kt`, replace each `TODO(...)`:

1. Convert Celsius to Fahrenheit.
2. Say if a number is negative, zero or positive using `when`.
3. Repeat some text using a `for` loop.
4. Use a default argument and a string template in a greeting.

I should be able to explain my answer out loud before I move on.

## What I want to add later

- Stage 2: default and named arguments, lists, mutable lists and a real `Student` model
- Stage 3: sets, maps, arrays and collection operations
- Stage 4: classes, data classes, constructors and encapsulation
- Stage 5: inheritance, interfaces, enums, sealed classes and null safety
- Stage 6: exceptions, lambdas, higher-order functions, extension functions and scope functions
- Stage 7: saving to a file, loading from a file and unit tests

The code is not perfect, and neither am I yet. That is fine. This repo is where I practise.
