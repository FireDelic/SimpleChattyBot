import kotlin.math.abs

const val TEN = 10
fun getLastDigit(a: Int): Int = abs(a % 10)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}