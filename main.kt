fun main() {
    val a = mutableListOf<Int>()

    println("Введіть витрати за кожен з 7 днів:")

    for (day in 1..7) {
        print("День $day: ")
        val input = readLine()
        val money = input?.toIntOrNull()

        if (money == null) {
            println("Це не число. Спробуйте ще раз.")
            return
        }

        if (money < 0) {
            throw IllegalArgumentException("Витрата не може бути від’ємною: $money")
        }

        a.add(money)
    }

    val totalSpent = a.sum()
    val maxSpent = a.maxOrNull() ?: 0
    val dayWithMaxSpent = a.indexOf(maxSpent) + 1
    val averageSpent = totalSpent / a.size

    println("\nЗагальні витрати: $totalSpent грн")
    println("Найбільша витрата була у день $dayWithMaxSpent: $maxSpent грн")
    println("Середня витрата: $averageSpent грн")

    val b = when {
        totalSpent < 500 -> "Економно"
        totalSpent in 500..999 -> "Помірно"
        totalSpent >= 1000 -> "Занадто багато"
        else -> "Невідомо"
    }

    println("Оцінка витрат: $b")
}
