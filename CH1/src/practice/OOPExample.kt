package practice
//Encapsulation
private class AClass {
    private fun run(){
        println("This is from class A")
    }

    fun runPublic(){
        println("This is from class A public")
    }
}

class BClass {
    fun run(){
        // We cannot call run because it's private
        // AClass().run()
        AClass().runPublic()
        println("This is from class B")
    }
}

// abstraction
interface Balloon{
    fun blow()
    fun pop()
}

abstract class HotAirBalloon : Balloon{
    override fun blow() {
        println("Blow the balloon using hot air")
    }

    override fun pop() {
        println("Danger !!!")
    }
    abstract fun carryPassengers()
}

class RedHotAirBalloon : HotAirBalloon(){
    override fun carryPassengers() {
        println("Carrying 5 passengers")
    }

    override fun blow() {
        println("Blow the balloon using doa")
    }

    fun moveLeft(){
        println("Move left")
}
//Polumorphism
class RedBalloon : Balloon{
    override fun blow() {
        println("Meniup balon merah")
    }

    override fun pop() {
        println("Balon merah meledak")
    }
}
//Polymorphism
class BlueBalloon : Balloon{
    override fun blow() {
        println("Meniup balon biru")
    }

    override fun pop() {
        println("Balon biru meledak")
    }
}

open class Processor(val name: String){
    fun initProcessor(){
        println("Processor $name is initializing")
    }
}

class AMDProcessor(): Processor("AMD Ryzen 5 5600X")
class IntelProcessor(): Processor("Intel Core i5-11400F")

}
fun main(args: Array<String>) {
    RedHotAirBalloon().let {
        it.blow()
        it.pop()
        it.moveLeft()
        it.carryPassengers()
    }
    RedHotAirBalloon.AMDProcessor().initProcessor()
    RedHotAirBalloon.IntelProcessor().initProcessor()
}