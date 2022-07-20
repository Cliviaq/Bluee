class Namess {
    var fname=""
    var lname=""
    var age=0
}

fun main() {
    val jina=Namess()
    jina.fname="Millie "
    jina.lname="Brown"
    jina.age=18
    println("My name is ${jina.fname}${jina.lname} and Im ${jina.age} years old.")

    val jina2=Namess()
    jina.fname="Caleb "
    jina.lname="Sinclare"
    jina.age=20
    println("My name is ${jina.fname}${jina.lname} and Im ${jina.age} years old.")

    val jina3 =Namess()
    jina.fname="Julia "
    jina.lname="Roberts"
    jina.age=40
    println("My name is ${jina.fname}${jina.lname} and Im ${jina.age} years old.")
}
