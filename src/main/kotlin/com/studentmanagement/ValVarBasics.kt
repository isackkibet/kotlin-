package com.studentmanagement

fun buildStudentHeader(school: String): String {
    val prefix = "SMS"
    var header = "$prefix | $school"
    header = header.uppercase()
    return header
}
