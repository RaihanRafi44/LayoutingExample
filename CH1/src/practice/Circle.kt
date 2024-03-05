package practice

import kotlin.math.PI

class Circle(private val radius: Double) {

    fun getRadius(): Double {
        return radius
    }

    fun areaCircleCalculate(): Double {
        return PI * radius * radius
    }

    fun circumferenceCircleCalculate(): Double {
        return 2 * PI * radius
    }

    fun printHeaderCircle(){
        println("Perhitungan Lingkaran")
        println("-------------------------------------")
    }
}

fun main(args: Array<String>) {
    val radius = 42.0
    val circle = Circle(radius)
    circle.printHeaderCircle()
    println("Jari-jari lingkaran adalah: ${circle.getRadius()}")
    println("Luas lingkaran dengan jari-jari yaitu $radius adalah: ${circle.areaCircleCalculate()}")
    println("Keliling lingkaran dengan jari-jari yaitu $radius adalah: ${circle.circumferenceCircleCalculate()}")
}


