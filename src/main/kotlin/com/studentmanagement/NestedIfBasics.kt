package com.studentmanagement

fun passLabel(mark: Int): String {
    if (mark >= 50) {
        if (mark >= 80) {
            return "High pass"
        }

        return "Pass"
    }

    return "Fail"
}
