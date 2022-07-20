open class `Parent cl`(var me:String,var age:Int) {
    var marks=45
    var marks1=78
}
class child0:`Parent cl`("Jose",29){
    fun math(){
        println("I have been able to get $me marks in the last paper.")
    }
}
class child1:`Parent cl`("Jamie",33) {
    fun English() {
        println("I have been able to get $age marks in the last paper.")
    }
}

fun main() {
    val obj0=child0()
    val obj1=child1()
    println(obj0.math())
    println(obj1.English())
}