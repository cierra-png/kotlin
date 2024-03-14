class staff(val name:String,val age:Int,val gender:String){

}

fun main(args: Array<String>) {
    val myob=staff("Hilda",19,"Female")
    println("staff name is ${myob.name}")
    println("staff age is ${myob.age}")
    println("staff gender is ${myob.gender}")
}