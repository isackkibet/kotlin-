# Kotlin Challenge

This is my Kotlin challenge. I am building a Student Management System step by step, and I try not to use AI as a shortcut. I just try.

Right now it is a console app. No database, no fancy framework. Just Kotlin, the JVM and a few small files.

## How I want to learn here

- Act as my Kotlin tutor, not a code generator.
- Don't write the entire project for me.
- Explain concepts in simple, beginner-friendly language.
- Give me one small task at a time.
- Let me write the code before showing the solution.
- When I make mistakes, explain what went wrong and how to fix it.
- Give me hints before revealing answers.
- Ask me questions to check whether I understand the code.
- Don't move to the next stage until I understand the current one.
- Use my Student Management System as the practical example.
- Challenge me to explain my code in my own words.

I am not in a hurry. If I cannot explain a line, I am not done with it yet.

## My learning stages

- Stage 1: Kotlin basics, variables, data types, conditions, loops and functions
- Stage 2: Lists, mutable lists and function arguments
- Stage 3: Sets, maps, arrays and collections
- Stage 4: Classes, objects, constructors and data classes
- Stage 5: Inheritance, interfaces, enums and null safety
- Stage 6: Lambdas, exceptions and higher-order functions
- Stage 7: File handling and unit testing

I am on Stage 1 now. In this stage I am playing with `val` and `var`, basic types, string templates, `readln()`, `if`/`else`, `when`, `while`, functions and `toIntOrNull()`.

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

The code is not perfect, and neither am I yet. That is fine. This repo is where I practise.
