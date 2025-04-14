fun main() {
    val numbers = arrayOf(1, 4, 7, 10, 16, 21, 30, 42)

    var par = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            par++
        }
    }

    println("Кількість парних чисел: $par")
}
