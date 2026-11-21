package com.studentmanagement

fun countAttempts(limit: Int): Int {
    var attempts = 0

    do {
        attempts++
    } while (attempts < limit)

    return attempts
}
