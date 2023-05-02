data class Laptop(var brand: String, var model: String, var ramSize: Int) {
    fun shutdown() {
        println("$brand $model has successfully shutdown.")
    }
}

fun main() {
    val macbook = Laptop("Apple", "Macbook Pro 14", 8)
    macbook.shutdown()
}