package com.android.sample.repo

fun main(){
    var stringValue = ""
    println("Enter book name: ")
    stringValue = readln()

    when (stringValue.lowercase()) {
        "harry potter" -> {
            println("$stringValue(not available) Genre:Novel, Fictional Fantasy")
        }

        "percy jackson" -> {
            println("$stringValue(available) Genre:Novel, Fictional Fantasy")
        }

        "one punch man" -> {
            println("$stringValue(available) Genre:Manga, Fictional Action Hero Fantasy")
        }

        "jujutsu kaisen" -> {
            println("$stringValue(available) Genre:Manga, Fictional Action Fantasy")
        }

        "twilight" -> {
            println("$stringValue(not available) Genre:Novel, Fictional Romance Fantasy")
        }

        else -> {
            println("ERROR: NO DATA ON OUR LIBRARY")
        }
    }
}