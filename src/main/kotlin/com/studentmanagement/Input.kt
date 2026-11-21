package com.studentmanagement

fun readText(label: String): String {
    print(label)
    return readln().trim().lowercase()
}

fun readNumber(label: String): Int {
    while (true) {
        print(label)
        val number = readln().toIntOrNull()

        if (number != null) {
            return number
        }

        println("Please type a whole number.")
    }
}

fun readChoice(label: String, validChoices: String): String {
    while (true) {
        val answer = readText(label)

        if (answer.length == 1 && answer in validChoices) {
            return answer
        }

        println("Please type one of: $validChoices")
    }
}
