fun main() {
    val string = "Hello, world"
    val reversedString = string.myReversed()
    println(reversedString)
}

fun String.myReversed(): String {
    var reversedString = ""
    for (i in length - 1 downTo 0) {
        reversedString += this[i]
    }
    return reversedString
}