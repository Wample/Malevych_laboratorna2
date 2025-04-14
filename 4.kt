fun main() {
    print("Введіть своє ім’я: ")
    val userName: String? = readLine()

    val finalName = if (userName.isNullOrBlank()) "Anonymous" else userName

    println("Привіт, $finalName")
}
