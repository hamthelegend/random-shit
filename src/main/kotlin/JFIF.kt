import java.io.File

fun main() {
    val files = File("C:/Users/hamue/OneDrive/Documents/College/Year 3 Sem 2/CC Fucking TV/uploaded").walk().filter { file -> file.extension.equals("jfif", ignoreCase = true) }
    files.forEachIndexed { index, file ->
        file.jfifToJpg(index)
    }
}

fun File.jfifToJpg(index: Int) {
    val destination = File("JFIF.jpg")
    renameTo(destination)
}