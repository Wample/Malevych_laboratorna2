fun main() {
    print("Введіть чисельник: ")
    val chis = readLine()?.toIntOrNull() ?: 0

    print("Введіть знаменник: ")
    val znam = readLine()?.toIntOrNull() ?: 1

    try {
        val result = chis / znam
        println("Результат ділення: $result")
    } catch (error: ArithmeticException) {
        println("Помилка: не можна ділити на нуль!")
    }
}
