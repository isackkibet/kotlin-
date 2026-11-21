package com.studentmanagement

fun runSmartChallenge() {
    println()
    println("Smart Challenge")
    println("Answer 3 quick questions.")

    var score = 0

    val canReassign = readChoice("Can a val be reassigned? (y/n): ", "yn") == "y"
    if (!canReassign) {
        score++
    } else {
        println("Hint: val is read-only. Use var when a value must change.")
    }

    val sum = readNumber("What is 7 + 5? ")
    if (sum == 12) {
        score++
    } else {
        println("Hint: 7 + 5 = 12.")
    }

    val keyword = readText("Which keyword declares a read-only value? (val/var): ")
    if (keyword == "val") {
        score++
    } else {
        println("Hint: var allows reassignment; val does not.")
    }

    val result = when {
        score == 3 -> "Excellent - Stage 1 mastered"
        score >= 2 -> "Good - review the hints"
        else -> "Keep practising - re-read Basics.kt"
    }

    println("Your score: $score/3 - $result")
}
