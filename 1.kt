fun main() {
    print("Enter the first number: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    print("Enter the first number: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    print("Enter the first number: ")
    val num3 = readLine()?.toIntOrNull() ?: 0

    val biggest = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }

    println("Найбільший номер: $biggest")
}
