class Car(var brand: String, var model: String, var year: Int) {
    fun drive() {
        println("Gas")
    }
}

fun main() {
    val c1 = Car("Ford", "Mustang", 1969)

    println(c1.brand + " " + c1.model + " " + c1.year)
    c1.drive()
}
