class mm (var angka1: Int, var angka2: Int) {
}

fun plus(i: Int, i1: Int): Int {
    val x = mm (10, 20)
    return x.angka1 + x.angka2
}

fun main () {
    println(plus(10, 20))
}