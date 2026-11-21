package com.studentmanagement

fun dayType(day: Int): String = when (day) {
    1, 2, 3, 4, 5 -> "Weekday"
    6, 7 -> "Weekend"
    else -> "Invalid"
}
