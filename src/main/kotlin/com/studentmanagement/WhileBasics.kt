package com.studentmanagement

fun countDownToExam(days: Int): String {
    var result = ""
    var current = days

    while (current > 0) {
        result += "$current "
        current--
    }

    return result.trim()
}
