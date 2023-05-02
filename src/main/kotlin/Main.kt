import kotlin.math.PI

fun main() {
    var count  = 1

    while(count <= 5) {
        println("Shape $count of 5:")
        print("SQUARE OR CIRCLE? : ")
        val shapeInput = readln()
        when(shapeInput){
            "SQUARE" -> {
                print("What is the side length of the square?: ")
                val lengthInput = readln().toInt()
                println("The area of a square with a side length of $lengthInput is ${lengthInput * lengthInput}")
            }

            "CIRCLE" -> {
                print("What is the radius of the circle?: ")
                val radiusInput = readln().toInt()
                println("The area of a circle with a radius of $radiusInput is ${PI * radiusInput * radiusInput}")
            }
            else -> {
                println("Error! Incorrect Input... GO FUCK YOURSELF")
                break;
            }
        }
        count++
    }


}