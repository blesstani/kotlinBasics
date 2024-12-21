package playGround
// open key word allows the Toyota class to inherit Car properties
open class Vehicle (var model:String, var color:String,)

//class car inherit Vehicle properties "model" and "color"
class Car(var age:Int, var owner:String): Vehicle(model = "Toyota", color = "Black"){
    var m= model
    var c= color
    fun display(){
        println(" $owner owned a $color $model for $age years ")
    }

}
