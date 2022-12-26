import java.util.Scanner

fun main() {
    do {
        println("terminal:~terminal$")
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Masukkan Pemain 1: ")
        val p1: String = readln()
        println("Masukkan Pemain 2: ")
        val p2: String = readln()
        println("")
        println("Hasil: ")
        if (p1 == "batu" && p2 == "gunting") {
            println("Pemain 1 MENANG!")
        } else if (p1 == "gunting" && p2 == "batu") {
            println("Pemain 2 MENANG!")
        } else if (p1 == "batu" && p2 == "kertas") {
            println("Pemain 2 MENANG!")
        } else if (p1 == "kertas" && p2 == "batu") {
            println("Pemain 1 MENANG!")
        } else if (p1 == "gunting" && p2 == "kertas") {
            println("Pemain 1 MENANG!")
        } else if (p1 == "kertas" && p2 == "gunting") {
            println("Pemain 2 MENANG!")
        } else {
            println("DRAW!")
        }

        println("Ingin bermain lagi (y/n)?: ")
        val ask: String = readln()
    } while(ask == "y")
}
    private operator fun Boolean.invoke(String: Any) {

    }


