//Identify 3 use cases that will efficiently use an Array, ArrayList, Set, Map.
//Show in code the examples you mentioned.

package com.android.sample.repo

//data class Game (var title: String, var price: Int)

fun main() {

    val gameList2 = HashMap<String, Double>()
    gameList2["Sons of the Forest"] = 29.99
    gameList2["God of War (2018)"] = 59.99
    gameList2["Red Dead Redemption 2"] = 59.99
    gameList2["GTA V"] = 12.99
    gameList2["Detroit Become Human"] = 59.99
    gameList2["Resident Evil 4 Remake"] = 69.99

    val gameSpecs2 = arrayOf<String>(
        "[1] Sons of the Forest",
        "[2] God of War (2018)",
        "[3] Red Dead Redemption 2",
        "[4] GTA V",
        "[5] Detroit Become Human",
        "[6] Resident Evil 4 Remake"
    )
    val gamePrice = mapOf(
        "Sons of the Forest " to 29.99,
        "God of War (2018) " to 59.99,
        "Red Dead Redemption 2 " to 59.99,
        "GTA V " to 12.99,
        "Detroit Become Human " to 59.99,
        "Resident Evil 4 Remake " to 69.99
    )
    val gamePrice2 = setOf(
        "[1] Sons of the Forest" to 29.99,
        "[2] God of War (2018)" to 59.99,
        "[3] Red Dead Redemption 2" to 59.99,
        "[4] GTA V" to 12.99,
        "[5] Detroit Become Human" to 59.99,
        "[6] Resident Evil 4 Remake" to 69.99
    )
    val gameSpecs = mutableMapOf(
        1 to "Title: Sons of the Forest\nRECOMMENDED:\n" +
                "Requires a 64-bit processor and operating system\n" +
                "OS: 64-bit Windows 10\n" +
                "Processor: INTEL CORE I7-8700K or AMD RYZEN 5 3600X\n" +
                "Memory: 16 GB RAM\n" +
                "Graphics: NVIDIA GeForce 1080Ti or AMD Radeon RX 5700 XT\n" +
                "DirectX: Version 11\n" +
                "Storage: 20 GB available space\n" +
                "Additional Notes: SSD (Preferred)",
        2 to "Title: God of War (2018)\nRECOMMENDED:\n" +
                "Requires a 64-bit processor and operating system\n" +
                "OS: Windows 10 64-bit\n" +
                "Processor: Intel i5-6600k (4 core 3.5 GHz) or AMD Ryzen 5 2400 G (4 core 3.6 GHz)\n" +
                "Memory: 8 GB RAM\n" +
                "Graphics: NVIDIA GTX 1060 (6 GB) or AMD RX 570 (4 GB)\n" +
                "DirectX: Version 11\n" +
                "Storage: 70 GB available space\n" +
                "Additional Notes: DirectX feature level 11_1 required",
        3 to "Title: Red Dead Redemption 2\nRECOMMENDED:\n" +
                "Requires a 64-bit processor and operating system\n" +
                "OS: Windows 10 - April 2018 Update (v1803)\n" +
                "Processor: Intel® Core™ i7-4770K / AMD Ryzen 5 1500X\n" +
                "Memory: 12 GB RAM\n" +
                "Graphics: Nvidia GeForce GTX 1060 6GB / AMD Radeon RX 480 4GB\n" +
                "Network: Broadband Internet connection\n" +
                "Storage: 150 GB available space\n" +
                "Sound Card: Direct X Compatible",
        4 to "Title: GTA V\nRECOMMENDED:\n" +
                "Requires a 64-bit processor and operating system\n" +
                "OS: Windows 10 64 Bit, Windows 8.1 64 Bit, Windows 8 64 Bit, Windows 7 64 Bit Service Pack 1\n" +
                "Processor: Intel Core i5 3470 @ 3.2GHz (4 CPUs) / AMD X8 FX-8350 @ 4GHz (8 CPUs)\n" +
                "Memory: 8 GB RAM\n" +
                "Graphics: NVIDIA GTX 660 2GB / AMD HD 7870 2GB\n" +
                "Storage: 72 GB available space\n" +
                "Sound Card: 100% DirectX 10 compatible",
        5 to "Title: Detroit Become Human\nRECOMMENDED:\n" +
                "Requires a 64-bit processor and operating system\n" +
                "OS: Windows 10 (64 bit)\n" +
                "Processor: Intel Core i5-6600 @ 3.3 GHz or AMD Ryzen 3 1300 X @ 3.4 GHz\n" +
                "Memory: 12 GB RAM\n" +
                "Graphics: Nvidia GeForce GTX 1060 or AMD Radeon RX 580 with 4GB VRAM minimum (Support of Vulkan 1.1 required)\n" +
                "Storage: 55 GB available space",
        6 to "Title: Resident Evil 4 Remake\nRECOMMENDED:\n" +
                "Requires a 64-bit processor and operating system\n" +
                "OS: Windows 10 (64 bit)/Windows 11 (64 bit)\n" +
                "Processor: AMD Ryzen 5 3600 / Intel Core i7 8700\n" +
                "Memory: 16 GB RAM\n" +
                "Graphics: AMD Radeon RX 5700 / NVIDIA GeForce GTX 1070\n" +
                "DirectX: Version 12\n" +
                "Network: Broadband Internet connection\n" +
                "Additional Notes: Estimated performance: 1080p/60fps \n・Framerate might drop in graphics-intensive scenes. \n・AMD Radeon RX 6700 XT or NVIDIA GeForce RTX 2070 required to support ray tracing."
    )

    print(">====================")
    print(" Welcome to Ryan's game library ")
    println("====================<")
    println()

    println("Enter A, B, and C to proceed: ")
    println("[A] Show list of games")
    println("[B] Show specification requirements of the game")
    println("[C] To add a game to your cart and purchase the game")
    println()
    println("Press [Y] to exit")
    println()
    print("Your input: ")

    val loopSample = true
    while (loopSample) {
        var stringSample = ""
        stringSample = readln()
        when (stringSample.lowercase()) {
            "a" -> {
                gamePrice.forEach { (games, price) ->
                    println("*==========================*")
                    println("- $games : $$price")
                }
                println("*==========================*")
                print("Press [Y] to exit or you can press [B] to check specs req and [C] to add a game to your cart: ")

            }
            "b" -> {
                println("Here's a list of the game you can check: ")
                gameSpecs2.forEach() {
                    println("*==========================*")
                    println(it)
                }
                println("*==========================*")
                println()
                print("Select the number of the game you want to check: ")
                var stringSample2 = ""
                stringSample2 = readln()
                when (stringSample2) {
                    "1" -> {
                        println()
                        println(gameSpecs[1])
                        println()
                        print("Press [Y] to exit \npress [A] to check the list of the game, \npress [B] if you want to check another game sys req \npress [C] to add a game to your cart \nYour input: ")
                    }
                    "2" -> {
                        println()
                        println(gameSpecs[2])
                        println()
                        print("Press [Y] to exit \npress [A] to check the list of the game, \npress [B] if you want to check another game sys req \npress [C] to add a game to your cart \nYour input: ")
                    }
                    "3" -> {
                        println()
                        println(gameSpecs[3])
                        println()
                        print("Press [Y] to exit \npress [A] to check the list of the game, \npress [B] if you want to check another game sys req \npress [C] to add a game to your cart \nYour input: ")
                    }
                    "4" -> {
                        println()
                        println(gameSpecs[4])
                        println()
                        print("Press [Y] to exit \npress [A] to check the list of the game, \npress [B] if you want to check another game sys req \npress [C] to add a game to your cart \nYour input: ")
                    }
                    "5" -> {
                        println()
                        println(gameSpecs[5])
                        println()
                        print("Press [Y] to exit \npress [A] to check the list of the game, \npress [B] if you want to check another game sys req \npress [C] to add a game to your cart \nYour input: ")
                    }
                    "6" -> {
                        println()
                        println(gameSpecs[6])
                        println()
                        print("Press [Y] to exit \npress [A] to check the list of the game, \npress [B] if you want to check another game sys req \npress [C] to add a game to your cart \nYour input: ")
                    }
                    else -> {
                        println()
                        println("You can only input up to number 6 options")
                        break
                    }
                }
            }
            "c" -> {
                println()
                println("Here's the game you can add to your cart and checkout:")
                gamePrice2.forEach { (games, price) ->
                    println("*==========================*")
                    println("$games : $$price")
                }
                println("*==========================*")
                println()
                print("Select the number of the game you want to add to your cart: ")
                var stringSample3 = ""
                stringSample3 = readln()
                when (stringSample3.lowercase()) {
                    "1" -> {
                        println()
                        println("You ordered Sons of the Forest and your total cost is $29.99")
                        println()
                        println("Thank you for using our app!")
                        }
                    "2" -> {
                        println()
                        println("You ordered God of War (2018) and your total cost is $59.99")
                        println()
                        println("Thank you for using our app!")
                        }
                    "3" -> {
                        println()
                        println("You ordered Red Dead Redemption 2 and your total cost is $59.99")
                        println()
                        println("Thank you for using our app!")
                        }
                    "4" -> {
                        println()
                        println("You ordered GTA V and your total cost is $12.99")
                        println()
                        println("Thank you for using our app!")
                        }
                    "5" -> {
                        println()
                        println("You ordered Detroit Become Human and your total cost is $59.99")
                        println()
                        println("Thank you for using our app!")
                        }
                    "6" -> {
                        println()
                        println("You ordered Resident Evil 4 Remake and your total cost is $69.99")
                        println()
                        println("Thank you for using our app!")
                        }
                    }

                }
                "y" -> {
                    println()
                    println("Thank you for using our app! :>")
                    break
                }
                else -> {
                    println("ERROR: You can only type the selected options")
                    break
                }
            }
        }
    }



