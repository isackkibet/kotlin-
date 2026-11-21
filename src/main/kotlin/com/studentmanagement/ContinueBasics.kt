package com.studentmanagement

fun skipLowMarks(start: Int): String {
    var result = ""

    for (mark in start..start + 4) {
        if (mark < 50) {
            continue
        }

        result += "$mark "
    }

    return result.trim()
}
