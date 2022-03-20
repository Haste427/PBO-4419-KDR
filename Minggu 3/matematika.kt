class matematika {
    fun pertambahan (a: Int,b: Int): Int {
        return a + b
    }
    fun pengurangan (a: Int,b: Int): Int {
        return a - b
    }
    fun perkalian (a: Int, b: Int): Int {
        return a * b
    }
    fun pembagian (a: Double, b: Double): Double {
        return a / b
    }
}
fun main() {
    var mm=matematika()
    println("Hasil dari 20 + 20 = "+mm.pertambahan(20,20))
    println("Hasil dari 10 - 5 = "+mm.pengurangan(10,5))
    println("Hasil dari 10 * 20 = "+mm.perkalian(10,20))
    println("Hasil dari 35 / 2 = "+mm.pembagian(35.0,2.0))
}