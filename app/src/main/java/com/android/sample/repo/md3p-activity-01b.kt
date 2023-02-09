package com.android.sample.repo

fun main() {

    // book list
    val book1 = "Harry Potter (AVAILABLE)"
    val book2 = "Percy Jackson & the Olympians (AVAILABLE)"
    val book3 = "One Punch Man (AVAILABLE)"
    val book4 = "Jujutsu Kaisen (AVAILABLE)"
    val book5 = "Twilight (AVAILABLE)"
    val book6 = "Highschool DxD (NOT AVAILABLE)"

    println("WELCOME TO OUR AUTOMATED LIBRARY APP!")
    println()
    println("press ENTER to display the list or type ANYTHING to exit")
    while (true) {
        val name = readln()
        if (name.isNullOrBlank()) {
            println("$book1")
            println("$book2")
            println("$book3")
            println("$book4")
            println("$book5")
            println("$book6")
            println()
        } else {
            println("Thank you for using our automated library!")
            break
        }

        var stringValue = ""
        println("Enter book name: ")
        stringValue = readln()

        when (stringValue.lowercase()) {
            "harry potter" -> {
                println("$stringValue(1997) is a series of seven fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at Hogwarts School of Witchcraft and Wizardry. The main story arc concerns Harry's conflict with Lord Voldemort, a dark wizard who intends to become immortal, overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles (non-magical people).")
            }

            "percy jackson & the olympians" -> {
                println("$stringValue(2005) is a series of five fantasy novels written by American author Rick Riordan, and the first book series in the Camp Half-Blood Chronicles. The novels are set in a world with the Greek gods in the 21st century, and follows the protagonist Percy Jackson, a young demigod who must prevent the Titans, led by Kronos (Cronus), from destroying the world.")
            }

            "one punch man" -> {
                println("$stringValue(2009) (Japanese: ワンパンマン, Hepburn: Wanpanman) is a Japanese superhero manga series created by One. It tells the story of Saitama, a superhero who, because he can defeat any opponent with a single punch, grows bored from a lack of challenge. One wrote the original webcomic manga version in early 2009. A digital manga remake, illustrated by Yusuke Murata, began publication on Shueisha's Tonari no Young Jump website in June 2012. Its chapters are periodically compiled and published into individual tankōbon volumes. As of November 2022, 27 volumes have been released. In North America, Viz Media has licensed the remake manga for English language release and has serialized it in its Weekly Shonen Jump digital magazine.")
            }

            "jujutsu kaisen" -> {
                println("$stringValue(2018) (呪術廻戦) is a Japanese manga series written and illustrated by Gege Akutami. It has been serialized in Shueisha's shōnen manga magazine Weekly Shōnen Jump since March 2018, with its chapters collected and published in 21 tankōbon volumes as of December 2022. The story follows high school student Yuji Itadori as he joins a secret organization of Jujutsu Sorcerers to eliminate a powerful Curse named Ryomen Sukuna, of whom Yuji becomes the host. Jujutsu Kaisen is a sequel to Akutami's Tokyo Metropolitan Curse Technical School, serialized in Shueisha's Jump GIGA from April to July 2017, later collected in a tankōbon volume, retroactively titled as Jujutsu Kaisen 0, in December 2018.")
            }

            "twilight" -> {
                println("$stringValue(2005) is a series of four fantasy romance novels, two companion novels, and one novella written by American author Stephenie Meyer. Released annually from 2005 through 2008, the four novels chart the later teen years of Bella Swan, a girl who moves to Forks, Washington, from Phoenix, Arizona and falls in love with a 104-year-old vampire named Edward Cullen. The series is told primarily from Bella's point of view, with the epilogue of Eclipse and the second part of Breaking Dawn being told from the viewpoint of character Jacob Black, a werewolf. A novella, The Short Second Life of Bree Tanner, which tells the story of a newborn vampire who appeared in Eclipse, was published on 2010")
            }
            "highschool dxd" -> {
                println("$stringValue is NOT AVAILABLE you pervert ;)")
                break
            }

            else -> {
                println("ERROR: NO DATA ON OUR LIBRARY")
                break
            }
        }

        var stringValue2 = ""
        val y = true
        //val booleanSample = ""
        val n = false
        //val booleanSample2 = ""

        println()
        println("Do you want to borrow this book?(y/n):")
        stringValue2 = readln()

        when (stringValue2.lowercase()) {
            ("y") -> {
                println("The book has been added to your cart! If you want to continue press ENTER again to show the list or you can type ANYTHING to exit")
            }
            ("n") -> {
                println("Sure you can try other books. Press ENTER again to show the list or you can type ANYTHING to exit")
            }
            else -> {
                println("ERROR")
                break
            }
        }
    }
}
