/*Activity 01 - F
Scope : String, Loops
Create an application that will accept 2 string inputs.
Your application will print all unique characters in both Strings.
Union of Unique characters in both Strings*/

package com.android.sample.repo

fun main() {
    print("====")
    print("Welcome to KodeGo Application")
    println("====")
    println()

    var continueLoop = true

    while (continueLoop) {
        print("Do you want to proceed?[Y/N]: ")
        when (readln().lowercase()) {
            "y" -> {
                var input1: String? = null
                while (input1 == null) {
                    print("Enter first string: ")
                    input1 = readln() ?: ""
                    if (input1.isNullOrBlank()) {
                        println("Error: Blank input")
                        println()
                        break
                    }


                    var input2: String? = null
                    while (input2 == null) {
                        print("Enter second string: ")
                        input2 = readln() ?: ""
                        if (input2.isNullOrBlank()) {
                            println("Error: Blank input")
                            println()
                            break
                        }
                    }

                    var builder = StringBuilder()

                    for (pl in input1 + input2) {
                        if (!builder.contains(pl)) {
                            builder.append(pl)
                        }
                    }
                    println("Unique characters in both strings: $builder")
                    continueLoop = false
                }
            }
            "n" -> {
                print("Thank you for using our app!")
                continueLoop = false
            }
            else -> {
                println("Error: you can only type [Y/N]")
            }
        }
    }
}
