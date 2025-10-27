import kotlin.random.Random
class VAGON {
    val capacity = Random.nextInt(5, 26)
    override fun toString(): String = "Вагон вместимостью $capacity пассажиров"
}
