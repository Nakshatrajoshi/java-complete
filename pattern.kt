fun main (){
    print("Enter the number ")
    val op = readLine()!!
    val a : Int = op.toInt()
    var i = 1 
    
    while (i <= a)
     {
        var j = 1 
        var count = i
        while(j <= i)
        {
            
            print( count )
            count = count + 1 
            j = j + 1
        }
        println(" ")
           i = i + 1
    }
}