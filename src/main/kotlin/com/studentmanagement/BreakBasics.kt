package com.studentmanagement

fun firstHighMark(start: Int): Int {
    for (mark in start..100) {
        if (mark > 90) {
            return mark
        }
    }

    return -1
}
