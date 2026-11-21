package com.studentmanagement

fun evenSeatNumbers(count: Int): String {
    var result = ""

    for (seat in 2..count step 2) {
        result += "$seat "
    }

    return result.trim()
}
