
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Human(name:String){
    var n:String=name
    fun think(){
        println("kotlin is cool $n")
    }
}
fun main() {
    val ben= Human("ben")
    ben.think()

}