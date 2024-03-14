class brave{
  // data member
    var nambari1:Int=4
  // member function
    fun add():Int{
        return nambari1+nambari1
    }
}
fun main(args: Array<String>) {
    //  instance of an object
    val myobj=brave()
    println(myobj.add())
}
