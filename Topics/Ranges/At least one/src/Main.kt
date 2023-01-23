fun main() {
    val startRange1 = readln().toInt()
    val endRange1 = readln().toInt()
    val startRange2 = readln().toInt()
    val endRange2 = readln().toInt()
    val value = readln().toInt()

    println(value in startRange1..endRange1 || value in startRange2..endRange2)
}