fun sum(val1: Int, val2: Int, val3: Int) = val1 + val2 + val3

fun main() {    
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(sum(a, b, c))
}