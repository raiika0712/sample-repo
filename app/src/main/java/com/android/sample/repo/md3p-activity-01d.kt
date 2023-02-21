/*Create an application that will accept 5 monetary amounts.
After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
The total of the 5  inputs will be divided by the answer in the second question input.
Note: Error checking must be done.*/
fun main() {
    print("====")
    println("Welcome to KodeGo Calculator")
    println("====")
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
                        println()
                    }
                }

                var amounts2: Int? = null
                while (amounts2 == null) {
                    print("Enter your second amount: ")
                    amounts2 = readln().toIntOrNull()
                    if (amounts2 == null) {
                        println("Error: you can input numbers only")
                        println()
                    }
                }

                var amounts3: Int? = null
                while (amounts3 == null) {
                    print("Enter your third amount: ")
                    amounts3 = readln().toIntOrNull()
                    if (amounts3 == null) {
                        println("Error: you can input numbers only")
                        println()
                    }
                }

                var amounts4: Int? = null
                while (amounts4 == null) {
                    print("Enter your fourth amount: ")
                    amounts4 = readln().toIntOrNull()
                    if (amounts4 == null) {
                        println("Error: you can input numbers only")
                        println()
                    }
                }

                var amounts5: Int? = null
                while (amounts5 == null) {
                    print("Enter your fifth amount: ")
                    amounts5 = readln().toIntOrNull()
                    if (amounts5 == null) {
                        println("Error: you can input numbers only")
                        println()
                    }
                }

                var sumSample = amounts1 + amounts2 + amounts3 + amounts4 + amounts5
                println()
                println("Total: $sumSample")
                println()

                var amounts6: Int? = null
                while (amounts6 == null) {
                    print("Divide the value by how many?: ")
                    amounts6 = readln().toIntOrNull()
                    if (amounts6 == null) {
                        println("Error: you can input numbers only")
                        println()
                    }
                }

                var devSample = sumSample / amounts6
                println("Result: $devSample")
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