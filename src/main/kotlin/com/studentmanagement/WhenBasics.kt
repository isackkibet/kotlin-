package com.studentmanagement

fun gradeLetter(mark: Int): String = when {
    mark >= 90 -> "A"
    mark >= 80 -> "B"
    mark >= 50 -> "C"
    else -> "F"
}
