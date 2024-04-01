

import kotlin.text.toInt
fun main() {
    // var i = 6 
    // val j = 10
    
    // println(i + j)
    // println(i - j)
    // println(i.toFloat()/j)
    // println(i * j)
    // println(i++ + ++i)
    print("enter the even number  a ")
    var a  = readLine()!!
     var b : Int = a.toInt()
     
     if (b % 2 == 0) {
        println("even")
     }
     else {
        println("error")
     }
      
     val num = b
       var c = 0
       var sum : Int = c.toInt()
     for (i in 2..num step 2)
     {
        sum += i
     }
  println("sum = $sum")

}

