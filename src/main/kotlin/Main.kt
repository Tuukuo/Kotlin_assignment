fun main(){
    printName("Tukuuo")
    remainder(15,7)
    sum(8,5,9,10)
    fact("I am Kind")


}
fun printName(name:String){
    println("Hello $name")
}
fun remainder(num1:Int, num2:Int ){
    var result=num1 % num2
    println( "result $result")

}
fun sum(a:Int,b:Int,x:Int,y:Int) {
    var result = a + b + x + y
    println("result=$result")
}
fun fact(interestingFact:String){
    println(interestingFact)


}

