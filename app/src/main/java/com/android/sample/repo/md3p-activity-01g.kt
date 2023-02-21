/*Create an application that will accept 1 string.
Your application will print “Palindrome” if the string is a palindrome.*/

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
                print("Enter a string: ")
                var input1 = readln().lowercase()
                var palindromeTrue = true

                for (i in 0 until input1.length / 2) {
                    if (input1[i] != input1[input1.length - i - 1]) {
                        palindromeTrue = false
                        break
                    }
                }
                if (palindromeTrue) {
                    println("$input1 is a palindrome".uppercase())
                    continueLoop = false }
                else {
                    println("$input1 is not a palindrome".uppercase())
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