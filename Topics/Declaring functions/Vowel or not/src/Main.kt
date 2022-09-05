fun isVowel(letter: Char): Boolean {
    return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'
}

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}
