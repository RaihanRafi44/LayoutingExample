//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//define with data types

val ind : Int = 0 //immutable > Tidak bisa diubah nilainya
var idx : String = "11/100" //mutable > Bisa diubah nilainya

// define without data types

val ab = "Loren Ipsum"
val an = 19
val an2 = 19.2

//konstanta
const val an3 = 19.223232434242432423

//array
val arrayData : Array<String> = arrayOf("askaska", "asaqokswok")
val arrData = arrayOf("1", "2", "3")

// list
val listData : List<String> = listOf("1", "2", "3")
val lstData = listOf("1", "2", "3")

// mutable list
val mutableList = mutableListOf<String>("12", "13", "14")

fun main() {
    /*   println(ind)
       println(arrData)
       println(listData)
       println(mutableList)
       mutableList.add("14")
       println(mutableList)
       idx = "Kucing Oren"
       println(idx)*/
    /*val menu = "Ayam Bakar"
    try{
        println(mutableList)
        mutableList.add("15")
        mutableList.add(2, "2000")
        mutableList.addAll(listOf("19", "20"))
        println(mutableList)
        mutableList.removeAt(0)
        println(mutableList)
        mutableList.remove("13")
        println(mutableList)

    }catch (e : Exception){
        println("Code Error")
    }*/
    printHeader()
}
fun printHeader(){
    println("=============================")
    println("Order PC App")
    println("=============================")
    println("1. Bundle Ryzen 5 + RTX 3060")
    println("2. Bundle Ryzen 9 + RTX 4080")
    println("3. Bundle Intel i7 + RTX 3060")
    println("4. Bundle Intel i9 + RTX 4080")
    println("==================================")
    println("Masukkan pilihan anda : ")
    try {
        val userPick = readln().toInt()
        println("Pilihan anda adalah $userPick")
    }catch (e : NumberFormatException){
        println("Menu Anda Salah")
        printHeader()
    }

}