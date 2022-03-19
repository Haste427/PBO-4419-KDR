class buku (var judul: String, var pengarang: String, var penerbit: String, var tahun: Int){
}

fun main (){
    val x = buku ("Pemrograman Berbasis Objek Dengan Java, ", "Indrajani, ", "Elexmedia Komputindo, ", 2007)
    val y = buku ("Dasar Pemrograman Java, ", "Abdul Kadir, ", "Andi Ofset, ", 2004)
    println(x.judul + x.pengarang + x.penerbit + x.tahun)
    println(y.judul + y.pengarang + y.penerbit + y.tahun)
