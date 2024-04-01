fun main (){


    println("Enter the value of a ")
    val op = readLine()!!
    val a : Int = op.toInt()
     var i = 2
    while (i<a){
        if(a%i == 0){
            println("not a prime number for  " + i )
        }
        else {
            println("prime number for  " + i )
        }
            i = i + 1
    }

}