class Students(val name:String,val gender :String,var year :Int) {
}

fun main() {
    val obj=Students("Finn","male",2002)
    println("My name is ${obj.name} I am a ${obj.gender} and I was born in the year ${obj.year}.")


    val obj2=Students("Mike ","male",2000)
    println("My name is ${obj2.name} I am a ${obj2.gender} and I was born in the year ${obj2.year}.")

    val obj3=Students("Racheal","female",1999)
    println("My name is ${obj3.name} I am a ${obj3.gender} and I was born in the year ${obj3.year}.")
}