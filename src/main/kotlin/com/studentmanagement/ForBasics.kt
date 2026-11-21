package com.studentmanagement

fun buildSeatLabels(count: Int): String {
    var labels = ""

    for (seat in 1..count) {
        labels += "S$seat "
    }

    return labels.trim()
}
