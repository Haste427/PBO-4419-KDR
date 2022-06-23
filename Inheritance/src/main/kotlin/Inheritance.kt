open class Animal(size: String, foots: String) {
    init {
        println("Size : $size.")
        println("Foots : $foots.")
    }
    open fun Move(move: String){
        println(" $move")
    }
}

class Mammals(size: String, foots: String): Animal(size, foots) {

    fun Food (food: String){
        println("Mammal eat : $food")
    }
    fun Skin (skin: String){
        println("Mammal Skin : $skin")
    }
    override fun Move(move: String) {
        println("Mammal is : $move")
    }
}

open class Bird(size: String, foots: String): Animal(size, foots) {

    open fun Food (food: String){
        println("Bird eat : $food")
    }
    open fun Skin (skin: String){
        println("Bird Skin : $skin")
    }
    override fun Move(move: String) {
        println("Bird is $move")
    }
}

class Pinguin(size: String, foots: String): Bird(size, foots) {

    override fun Food (food: String){
        println("Penguin eat : $food")
    }
    override fun Skin (skin: String){
        println("Pinguin Skin : $skin")
    }
    override fun Move(move: String) {
        println("Penguin is $move")
    }
}


fun main(args: Array<String>) {
    println("------Mammals------")
    val a1 = Mammals("Large","Medium")
    a1.Food("Fruits, Meat")
    a1.Skin("Feather")
    a1.Move("Run")
    println("-------------------")

    println("-------Birds-------")
    val a2 = Bird("Small","Small")
    a2.Food("Insect, Fish, Grain")
    a2.Skin("Feather")
    a2.Move("Fly")
    println("-------------------")

    println("-----Pinguins------")
    val a3 = Pinguin("Medium","Small")
    a3.Food("Fish")
    a3.Move("Fly")
    println("-------------------")
}