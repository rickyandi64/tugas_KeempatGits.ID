fun main(args: Array<String>) {

    val makanan_kesukaan = listOf("Ayam Geprek", "Ayam Penyet", "Ayam Bakar", "Bakso", "Martabak Telor")
    println("Berikut ini adalah Makanan kesukaan saya :")
    for ((index, makanan) in makanan_kesukaan.withIndex()) {
        println("${index + 1}. $makanan")
    }
}
