package com.studentmanagement

fun formatStudentId(id: Int): String = "STU-${id.toString().padStart(3, '0')}"
