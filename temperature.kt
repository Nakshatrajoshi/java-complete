import java.util.*

fun main() {
  

println("entre the temperature in fahrenheti")
val op = readLine()!!
val a : Double = op.toDouble()

val celsius = (( a - 32 )* 5)/9
println("Temperatur in fahrenheit ($a) = Celsius ($celsius) ")
}