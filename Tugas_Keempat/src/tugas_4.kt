fun main(args: Array<String>) {
    /*Berikut ini data penyipanan Makanan Kesukaan
    hasil Ouputnnya :
    1. Ayam Geprek
    2. Ayam Penyet
    3. Ayam Bakar
    4. Bakso
    5. Martabak Telor
    */
    val makanan_kesukaan = listOf("Ayam Geprek", "Ayam Penyet", "Ayam Bakar", "Bakso", "Martabak Telor")
    println("Berikut ini adalah Makanan kesukaan saya :")
    // Berikut ini fungsi untuk menampilkan data yang ada di Val
    for ((index, makanan) in makanan_kesukaan.withIndex()) {
        println("${index + 1}. $makanan")
    }
}
