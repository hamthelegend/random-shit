@file:Suppress("MoveVariableDeclarationIntoWhen")

enum class CoinFace { Heads, Tails }

fun main() {
//    var lives = 9
//    println(
//        flipACoin(
//            onHeads = { lives++ },
//            onTails = { lives-- }
//        )
//    )
//    println(lives)
//
//    onEvenDieRoll { roll ->
//        lives = roll
//    }

    val animals = listOf("Me-Mow", "Jake", "Herb", "Marc")
    println(animals.myFilter { x -> x.startsWith("M") })
}

fun flipACoin(
    onHeads: () -> Unit,
    onTails: () -> Unit,
): CoinFace {
    val coinFace = CoinFace.values().random()
    when (coinFace) {
        CoinFace.Heads -> onHeads()
        CoinFace.Tails -> onTails()
    }
    return coinFace
}

fun onEvenDieRoll(onEven: (Int) -> Unit) {
    val roll = (1..6).random()
    if (roll % 2 == 0) {
        onEven(roll)
    }
}

fun List<String>.myFilter(predicate: (String) -> Boolean): List<String> {
    val filteredList = mutableListOf<String>()
    for (string in this) {
        if (predicate(string)) {
            filteredList.add(string)
        }
    }
    return filteredList
}