fun main() {
    println("Welcome to KodeGo Calculator")
    println()

    var continueLoop = true

    while (continueLoop) {
        print("Do you want to proceed?[Y/N]: ")
        when (readln().lowercase()) {
            "y" -> {
                var amounts1: Int? = null
                while (amounts1 == null) {
                    print("Enter your first amount: ")
                    amounts1 = readln().toIntOrNull()
                    if (amounts1 == null) {
                        println("Error: you can input numbers only")
                    }
                }

                var amounts2: Int? = null
                while (amounts2 == null) {
                    print("Enter your second amount: ")
                    amounts2 = readln().toIntOrNull()
                    if (amounts2 == null) {
                        println("Error: you can input numbers only")
                    }
                }

                var amounts3: Int? = null
                while (amounts3 == null) {
                    print("Enter your third amount: ")
                    amounts3 = readln().toIntOrNull()
                    if (amounts3 == null) {
                        println("Error: you can input numbers only")
                    }
                }

                var amounts4: Int? = null
                while (amounts4 == null) {
                    print("Enter your fourth amount: ")
                    amounts4 = readln().toIntOrNull()
                    if (amounts4 == null) {
                        println("Error: you can input numbers only")
                    }
                }

                var amounts5: Int? = null
                while (amounts5 == null) {
                    print("Enter your fifth amount: ")
                    amounts5 = readln().toIntOrNull()
                    if (amounts5 == null) {
                        println("Error: you can input numbers only")
                    }
                }

                var resultSample = amounts1 + amounts2 + amounts3 + amounts4 + amounts5 * amounts2
                println("Result: $resultSample")
                break
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