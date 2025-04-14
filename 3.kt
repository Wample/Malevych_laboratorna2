fun main() {
    print("Введіть числа через пробіл: ")
    val input = readLine()

    val numbers = input
        ?.split(" ")
        ?.mapNotNull { it.toIntOrNull() }
        ?.toTypedArray() ?: emptyArray()

    var sum = 0

    for (number in numbers) {
        sum += number
    }

    val average = if (numbers.isNotEmpty()) sum / numbers.size else 0

    println("Середнє значення: $average")
}
