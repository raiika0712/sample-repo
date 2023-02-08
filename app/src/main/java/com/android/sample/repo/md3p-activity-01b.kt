package com.android.sample.repo

fun main() {

    // book list
    val book1 = "Harry Potter (AVAILABLE)"
    val book2 = "Percy Jackson & the Olympians (AVAILABLE)"
    val book3 = "One Punch Man (AVAILABLE)"
    val book4 = "Jujutsu Kaisen (AVAILABLE)"
    val book5 = "Twilight (AVAILABLE)"
    val book6 = "Highschool DxD (NOT AVAILABLE)"

    println("press ENTER to display the list:")
    while (true) {
        val name = readln()
        if (name.isNullOrBlank()) {
            println("$book1")
            println("$book2")
            println("$book3")
            println("$book4")
            println("$book5")
            println("$book6")
            println()
        } else {
            return (main())
        }

        var stringValue = ""
        println("Enter book name: ")
        stringValue = readln()

        when (stringValue.lowercase()) {
            "harry potter" -> {
                println("$stringValue is a series of seven fantasy novels written by British author J. K. Rowling.")
            }

            "percy jackson & the olympians" -> {
                println("$stringValue is a series of five fantasy novels written by American author Rick Riordan, and the first book series in the Camp Half-Blood Chronicles.")
            }

            "one punch man" -> {
                println("$stringValue (Japanese: ワンパンマン, Hepburn: Wanpanman) is a Japanese superhero manga series created by One.")
            }

            "jujutsu kaisen" -> {
                println("$stringValue (呪術廻戦) is a Japanese shonen manga series written and illustrated by Gege Akutami.")
            }

            "twilight" -> {
                println("$stringValue is a series of four fantasy romance novels, two companion novels, and one novella written by American author Stephenie Meyer.")
            }
            "highschool dxd" -> {
                println("$stringValue is NOT AVAILABLE you pervert ;)")
            }

            else -> {
                println("ERROR: NO DATA ON OUR LIBRARY")
            }
        }
    }
}