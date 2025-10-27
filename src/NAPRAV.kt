import java.util.Locale
import java.util.Locale.getDefault
import kotlin.random.Random

class Route {
}
fun NAPRAV() {
    var continueWork = true

    while (continueWork) {
        val route = Route()
        println("\nОтправляем поезд по маршруту: ${route}")
        print("Введите EXIT для завершения работы или нажмите Enter для продолжения: ")
        val userInput = readLine()?.trim()?.uppercase(getDefault())
        if (userInput == "EXIT") {
            continueWork = false
            println("Программа завершена.")
        }
    }
}




