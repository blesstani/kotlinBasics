package playGround
// open key word allows the Toyota class to inherit Car properties
open class Vehicle (var model:String, var color:String)

//class car inherit Vehicle properties "model" and "color"
class Car(private var age:Int, private var owner:String): Vehicle(model = "Toyota", color = "Black"){

    fun display(){
        println(" $owner owned a $color $model for $age years ")
    }

}
