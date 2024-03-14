class safaristu{
 //   data member
    var nambari1:Int=9

 // Member function
    fun square():Int{
        return nambari1 * nambari1
    }
}

fun main(args: Array<String>) {
  //  instance of an object
    val myobj=safaristu()
    println(myobj.square())
}
