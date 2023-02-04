package com.android.sample.repo

data class Students(val name: String, var progress: Int)

fun main() {
    val students = mutableListOf<Student>()
    addStudents(students)
    for (student in students) {
        println("${student.name}'s progress: ${student.progress}%")
    }
    updateProgress(students)
    println("\nUpdated Progress:")
    for (student in students) {
        println("${student.name}'s progress: ${student.progress}%")
    }
}

fun addStudents(students: MutableList<Student>) {
    println("Enter the names of the students, one per line. Enter an empty line to finish.")
    while (true) {
        print("Enter name: ")
        val name = readLine()
        if (name.isNullOrBlank()) {
            break
        }
        students.add(Student(name, 0))
    }
}

fun updateProgress(students: MutableList<Student>) {
    for (student in students) {
        print("Enter progress for ${student.name}: ")
        val progress = readLine()!!.toInt()
        student.progress += progress
    }
}
