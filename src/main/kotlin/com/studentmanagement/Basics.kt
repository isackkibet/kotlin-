package com.studentmanagement

private const val MIN_AGE = 3
private const val MAX_AGE = 120

fun runBasicsStage() {
    val name = prompt("Enter your name: ")
    val age = promptInt("Enter your age: ", MIN_AGE, MAX_AGE)

    println(buildWelcomeMessage(name, age))
    printMenu()

    val choice = promptInt("Choose an option: ", 1, 3)
    println(handleMenuChoice(choice))
}

private fun prompt(label: String): String {
    print(label)
    return readln()
}

private fun promptInt(label: String, min: Int, max: Int): Int {
    while (true) {
        print(label)
        val number = readln().toIntOrNull()

        if (number != null && number in min..max) {
            return number
        }

        println("Please enter a whole number from $min to $max.")
    }
}

private fun buildWelcomeMessage(name: String, age: Int): String {
    val status = if (age >= 18) "adult" else "minor"
    return "Hello, $name! You are $age years old, so you are an $status."
}

private fun printMenu() {
    println("1. Add student")
    println("2. View students")
    println("3. Exit")
}

private fun handleMenuChoice(choice: Int): String = when (choice) {
    1 -> "Add student selected. We will build this in a later stage."
    2 -> "View students selected. We will build this in a later stage."
    3 -> "Goodbye!"
    else -> "Unknown option."
}
