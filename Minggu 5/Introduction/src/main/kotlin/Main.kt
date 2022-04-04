/* This is a multi-line comment.
 * The problem prints "Hello, World!" to the standard output.
 */
fun main(args : Array<String>) {
    var nama: String = "Diky"
    val umur: Int = 22
    val number1 = 12.5
    val number2 = 3.5
    var result: Double
    val number3: Int = 545344
    val number4: Byte = number1.toInt().toByte()
    val flag = true
    println("Hello, World!")
    println("Nama saya : "+"$nama")
    println("Umur saya : "+"$umur")
    result = number1 + number2
    println("number1 + number2 = $result")
    result = number1 - number2
    println("number1 - number2 = $result")
    result = number1 * number2
    println("number1 * number2 = $result")
    result = number1 / number2
    println("number1 / number2 = $result")
    result = number1 % number2
    println("number1 % number2 = $result")
    println("number3 = $number3")
    println("number4 = $number4")
}
