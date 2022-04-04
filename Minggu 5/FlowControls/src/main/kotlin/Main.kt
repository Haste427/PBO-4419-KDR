fun main(args: Array<String>) {
    val number = -10
    val a = 12
    val b = 5
    var i = 1
    if (number > 0) {
        print("Positive number")
    } else {
        print("Negative number")
    }
    println("Enter operator either +, -, * or /")
    val operator = readLine()
    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }
    println("result = $result")
    while (i <= 5) {
        println("Line $i")
        ++i
    }
    for (i in 1..5) {
        println("$i Always printed.")
        if (i > 1 && i < 5) {
            continue
        }
        println("$i Not always printed.")
    }
}