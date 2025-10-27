import kotlin.random.Random

class Bileti {
}
fun sellBileti(): Int {
    val minPassengers = 5
    val maxPassengers = 201
    val random = Random.Default
    return random.nextInt(minPassengers, maxPassengers)
}

