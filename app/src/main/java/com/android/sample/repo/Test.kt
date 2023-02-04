package com.android.sample.repo

data class Student(val name: String)

fun main() {
    println("Enter student name: ")
    val students = mutableListOf(
    Student("Ryan"),
    Student("Tipani"),
    Student("Chica")
    )
}
