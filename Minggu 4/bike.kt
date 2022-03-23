class bike {
    var brand = ""
    var model = ""
    var year = 0
}

fun main() {
    val c1 = bike()
    c1.brand = "BMW"
    c1.model = "Supra Bapak"
    c1.year = 1970

    val c2 = bike()
    c2.brand = "Mercedez"
    c2.model = "Astrea"
    c2.year = 1999

    println(c1.brand + c1.model)
    println(c2.brand + c2.model)
}
