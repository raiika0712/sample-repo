package com.android.sample.repo

fun main() {
    println("STUDENT DATA")
    var stringValue = ""
    println("Enter student name: ")
    stringValue = readln()

    when (stringValue.lowercase()) {
        "ryan" -> {
            println("$stringValue's progression is 95%")
        }
        "tipani" -> {
            println("$stringValue's progression is 85%")
        }
        "chica" -> {
            println("$stringValue's progression is 70%")
        }
        "nacho" -> {
            println("$stringValue's progression is 80%")
        }
        "casper" -> {
            println("$stringValue's progression is 90%")
        }
        else -> {
            println("ERROR: NO DATA")
        }
    }
}