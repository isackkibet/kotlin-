package com.studentmanagement

fun runComposeVocabularyChallenge() {
    println()
    println("Compose Vocabulary Challenge")
    println("These are Jetpack Compose APIs, not core Kotlin keywords.")

    var score = 0

    if (askQuestion(
            "Which declares a Compose UI function?",
            "(a) @Composable (b) Modifier (c) Scaffold",
            "a",
            "@Composable marks a function that builds UI."
        )
    ) score++

    if (askQuestion(
            "Which API should you use to display words?",
            "(a) Box() (b) Text() (c) Row()",
            "b",
            "Text() displays words."
        )
    ) score++

    if (askQuestion(
            "Which API creates a clickable button?",
            "(a) Button() (b) Image() (c) Column()",
            "a",
            "Button() creates a clickable button."
        )
    ) score++

    if (askQuestion(
            "Which API allows typing?",
            "(a) Icon() (b) TextField() (c) Box()",
            "b",
            "TextField() accepts user input."
        )
    ) score++

    if (askQuestion(
            "Which API arranges components vertically?",
            "(a) Row() (b) Column() (c) Box()",
            "b",
            "Column() stacks components top to bottom."
        )
    ) score++

    if (askQuestion(
            "Which API arranges components horizontally?",
            "(a) Column() (b) Row() (c) Scaffold()",
            "b",
            "Row() places components left to right."
        )
    ) score++

    if (askQuestion(
            "Which API overlays components?",
            "(a) Box() (b) LazyColumn() (c) Text()",
            "a",
            "Box() places components on top of each other."
        )
    ) score++

    if (askQuestion(
            "Which API displays pictures?",
            "(a) Icon() (b) Image() (c) Button()",
            "b",
            "Image() displays pictures."
        )
    ) score++

    if (askQuestion(
            "Which API displays symbols?",
            "(a) Text() (b) Image() (c) Icon()",
            "c",
            "Icon() displays small symbols."
        )
    ) score++

    if (askQuestion(
            "Which API shows many records efficiently?",
            "(a) Column() (b) LazyColumn() (c) Row()",
            "b",
            "LazyColumn() only composes visible items."
        )
    ) score++

    if (askQuestion(
            "Which API remembers screen data across recompositions?",
            "(a) remember (b) Modifier (c) NavHost()",
            "a",
            "remember stores a value in the composition."
        )
    ) score++

    if (askQuestion(
            "Which API tracks changing data and triggers recomposition?",
            "(a) mutableStateOf() (b) Text() (c) Scaffold()",
            "a",
            "mutableStateOf() creates observable state."
        )
    ) score++

    if (askQuestion(
            "Which API styles components?",
            "(a) Scaffold() (b) Modifier (c) remember",
            "b",
            "Modifier controls layout, appearance and interaction."
        )
    ) score++

    if (askQuestion(
            "Which API structures a screen?",
            "(a) Scaffold() (b) Box() (c) TextField()",
            "a",
            "Scaffold() provides standard screen slots."
        )
    ) score++

    if (askQuestion(
            "Which API moves between screens?",
            "(a) NavHost() (b) Column() (c) Image()",
            "a",
            "NavHost() manages navigation between screens."
        )
    ) score++

    val result = when {
        score == 15 -> "All Compose vocabulary mastered"
        score >= 12 -> "Strong - review the hints"
        score >= 8 -> "Getting there - repeat the quiz"
        else -> "Keep learning - read the table below"
    }

    println("Your Compose vocabulary score: $score/15 - $result")
    printComposeApiTable()
}

private fun askQuestion(
    question: String,
    options: String,
    correct: String,
    hint: String
): Boolean {
    val answer = readChoice("$question $options: ", "abc")

    if (answer == correct) {
        return true
    }

    println(hint)
    return false
}

private fun printComposeApiTable() {
    println()
    println("You want to...                     Use")
    println("Declare a Compose UI function      @Composable")
    println("Display words                      Text()")
    println("Create a button                    Button()")
    println("Allow typing                       TextField()")
    println("Arrange vertically                 Column()")
    println("Arrange horizontally               Row()")
    println("Overlay components                 Box()")
    println("Display pictures                   Image()")
    println("Display symbols                    Icon()")
    println("Show many records                  LazyColumn()")
    println("Remember screen data               remember")
    println("Track changing data                mutableStateOf()")
    println("Style components                   Modifier")
    println("Structure a screen                 Scaffold()")
    println("Move between screens               NavHost()")
}
