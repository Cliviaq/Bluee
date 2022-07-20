fun main() {
    var no=89
    if (no<39) {
        println("Fail")
    }
    else if (no<50&&no>39){
        println("Pass")}
    else if(no<65&&no>51){
        println("Average")}
    else if (no<75&&no>66){
        println("B grade")}
    else if (no<100&&no>76){
        println("a+")}
    else{
        println("invalid")
    }
}