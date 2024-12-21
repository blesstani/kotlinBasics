import playGround.Car

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Human(n:String){

    var name:String=n
    var age: Int=0
    constructor(age: Int, name:String) : this(name){
        this.age=age
    }

    fun express(){
        println("kotlin is cool $name : $age")
    }
}
fun main() {
    val ben= Human(40,"Ben")
    ben.express()
 val lil = Car(3,"John",)
    lil.display()
}