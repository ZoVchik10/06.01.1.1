
import kotlin.io.encoding.Base64
import kotlin.random.Random
fun main(): Int {
    val cities = listOf(
        "moskva",
        "voronesh",
        "spb",
        "novosib",
        "ekb",
        "kazan",
        "nizniy novgorod",
        "chelabinsk",
        "samara",
        "tomsk",
        "omsk",
        "ufa",
        "krasnodar",
        "perm",
        "vologda",
        "petrozavodsk"
    )
    val random = Random.Default
    val startIndex = random.nextInt(cities.size)
    val endIndex = random.nextInt(cities.size)
    var continueWork = true

    while (continueWork) {
        val route = Route()
        println("\nОтправляем поезд по маршруту: ${route}")
        print("Введите EXIT для завершения работы или нажмите Enter для продолжения: ")
        val userInput = readLine()?.trim()?.uppercase(Base64.Default())
        if (userInput == "EXIT") {
            continueWork = false
            println("Программа завершена.")
            val minPassengers = 5
            val maxPassengers = 201
            val random = Random.Default
            return random.nextInt(minPassengers, maxPassengers)
        }
    }
}


