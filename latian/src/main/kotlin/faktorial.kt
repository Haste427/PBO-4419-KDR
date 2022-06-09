fun main() {
    var result: Int = 1
    println("Masukkan angka : ")
    var n: Int = readLine()!!.toInt();
    if (n <= 0){
        print("Angka yang dimasukkan bukan bilangan bulat")
    } else {
        for (i in 1..n) {
            result *= i
        }
        print("Faktorial dari " + n + " adalah " + result)
    }
}