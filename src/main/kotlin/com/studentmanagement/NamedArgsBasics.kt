package com.studentmanagement

fun studentLine(id: Int, name: String): String = "$id: $name"

fun buildLine(): String = studentLine(name = "Ada", id = 7)
