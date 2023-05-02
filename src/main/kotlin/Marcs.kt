import kotlin.math.PI

fun main() {

    for (i in 1 .. 5) {
        println("What shape do you want?")
        val answer = readln().lowercase()

        when(answer) {
            "square" -> {
                println("What's the side length of the square?")
                val squareInput = readln().toInt()
                val squareResult = squareInput * squareInput
                println("The area of square is: $squareResult")
            }

            "circle" -> {
                println("What's the radius of the circle?")
                val circleInput = readln().toInt()
                val circleResult = PI * circleInput * circleInput
                println("The area of the circle is: $circleResult")
            }

            else ->  println("Wrong input!")

        }


    }
}