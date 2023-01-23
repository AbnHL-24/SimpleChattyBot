fun main() {
    val a = readln().toLong()
    val b = readln().toLong()
    var resultado: Long = 1

    for (i in a until b) resultado *= i
    println(resultado)
}