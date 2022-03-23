
  
open class MyParentClass {
    val x = "Hallo"
}

class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x)
    }
}

fun main() {
    val myObj = MyChildClass()
    myObj.myFunction()
}
