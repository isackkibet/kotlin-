package com.studentmanagement

fun runComposeVocabularyChallenge() {
    println()
    println("Compose Vocabulary Challenge")
    println("These are Jetpack Compose APIs, not core Kotlin keywords.")

    var score = 0

    if (readChoice("Which declares a Compose UI function? (a) @Composable (b) Modifier (c) Scaffold: ", "abc") == "a") {
        score++
    } else {
        println("Hint: @Composable marks a function that builds UI.")
    }

    if (readChoice("Which displays a scrolling list efficiently? (a) Row (b) LazyColumn (c) Box: ", "abc") == "b") {
        score++
    } else {
        println("Hint: LazyColumn only composes visible items.")
    }

    if (readChoice("Which keeps UI state across recompositions? (a) remember (b) Text (c) Icon: ", "abc") == "a") {
        score++
    } else {
        println("Hint: remember stores a value in the composition.")
    }

    if (readChoice("Which arranges children vertically? (a) Row (b) Column (c) Box: ", "abc") == "b") {
        score++
    } else {
        println("Hint: Column stacks top to bottom.")
    }

    if (readChoice("Which provides standard screen structure? (a) Scaffold (b) TextField (c) Image: ", "abc") == "a") {
        score++
    } else {
        println("Hint: Scaffold provides topBar, content and floatingActionButton slots.")
    }

    println("Your Compose vocabulary score: $score/5")
    printComposeCheatSheet()
}

private fun printComposeCheatSheet() {
    println()
    println("Compose cheat sheet")
    println("@Composable - declares a UI function")
    println("Text - displays text")
    println("Button - clickable button")
    println("TextField - accepts user input")
    println("Column - vertical arrangement")
    println("Row - horizontal arrangement")
    println("Box - overlapping container")
    println("Image - displays an image")
    println("Icon - displays an icon")
    println("LazyColumn - efficient scrolling list")
    println("remember - keeps state across recompositions")
    println("mutableStateOf - creates observable state")
    println("Modifier - controls layout, appearance and interaction")
    println("Scaffold - standard screen structure")
    println("NavHost - manages navigation between screens")
}
