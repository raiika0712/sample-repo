package com.android.sample.repo

import kotlin.random.nextInt

fun main() {

    // students list
    val student1 = "Alexander Chou"
    val student2 = "Vic Amable"
    val student3 = "John Chris Bolanio"
    val student4 = "Aziza Villanueva San Buenaventura"
    val student5 = "Andrew Bustos"
    val student6 = "Rizwan Caser"
    val student7 = "Mark Andrei Condino"
    val student8 = "Laurence De Dios"
    val student9 = "Jerome Elenzano"
    val student10 = "Noven Rey Gumnad"
    val student11 = "Hanz Bradford Jaramillo"
    val student12 = "Junzon Velasco"
    val student13 = "ZR Lopez"
    val student14 = "Victor Paolo Luzares"
    val student15 = "Ryan Malacao"
    val student16 = "Phil Seong Manabat"
    val student17 = "Ray Andrew Manila"
    val student18 = "Dad Ivan Navidad"
    val student19 = "Marie Fe Dela Pena"
    val student20 = "Arthur Aldrin Ramos"
    val student21 = "Emmanuel De Los Reyes"
    val student22 = "Gretchen Roque"
    val student23 = "Rey Brezuela Saliot"
    val student24 = "Jeffrey Saltiga"
    val student25 = "Rene Galo Tajos"
    val student26 = "Mark Taliman"
    val student27 = "Jother John Tirador"
    val student28 = "Joe Mari Pasicolan Ubay"
    val student29 = "Vince Melmar Ybanez"
    val student30 = "Raffy Yalung"

    println("press ENTER to display students list:")
    while (true) {
        val name = readln()
        if (name.isNullOrBlank()) {
            println("$student1")
            println("$student2")
            println("$student3")
            println("$student4")
            println("$student5")
            println("$student6")
            println("$student7")
            println("$student8")
            println("$student9")
            println("$student10")
            println("$student11")
            println("$student12")
            println("$student13")
            println("$student14")
            println("$student15")
            println("$student16")
            println("$student17")
            println("$student18")
            println("$student19")
            println("$student20")
            println("$student21")
            println("$student22")
            println("$student23")
            println("$student24")
            println("$student25")
            println("$student26")
            println("$student27")
            println("$student28")
            println("$student29")
            println("$student30")
            println()
        }
        else {
            return (main())
        }

        var stringValue = ""
        println("Enter student name: ")
        stringValue = readln()
        val gradeRandom = (0..100).random()


        when (stringValue.lowercase()) {
            "alexander chou" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "vic amable" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "john chris bolanio" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "aziza villanueva san buenaventura" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "andrew bustos" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "rizwan caser" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "mark andrei condino" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "laurence de dios" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "jerome elenzano" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "noven rey gumnad" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "hanz bradford jaramillo" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "junzon velasco" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "zr lopez" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "victor paolo luzares" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "ryan malacao" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "phil seong manabat" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "ray andrew manila" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "dad ivan navidad" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "marie fe dela pena" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "arthur aldrin ramos" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "emmanuel de los reyes" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "gretchen roque" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "rey brezuela saliot" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "jeffrey saltiga" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "rene galo tajos" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "mark taliman" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "jother john tirador" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "joe mari pasicolan ubay" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "vince melmar ybanez" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            "raffy yalung" -> {
                println("$stringValue's progression is $gradeRandom%")
            }
            else -> {
                println("ERROR: NO DATA")
            }
        }
    }
}