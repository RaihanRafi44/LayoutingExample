package practice

import app.model.ComputerSpec

class ControlFlow {
    private val computerData = listOf(
        ComputerSpec(
            processorName = "Intel i9",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGB = 32,
            EGPUName = "RTX 4060"
        ), //Computer 1
        ComputerSpec(
            processorName = "Intel i7",
            processorTotalCore = 8,
            isHaveIGPU = false,
            totalRamInGB = 16,
            EGPUName = "RTX 3060"
        ) //Computer 2
    )
    fun run(){
        checkName()
        println(checkName("han"))
        println(checkName("agus"))
        exampleWhen()
        printSomething()

    }

    private fun checkName(name : String?) : String {
        //if else
        return if(name == null){
            "Your name still empty"
        }
        else if(name.contains("Raihan", ignoreCase = true)){
            "Oh Raihan anak Baki"
        }
        else if (name.contains("Andi", ignoreCase = true)){
            "Halo Andi"
        }
        else{
            "Kamu siapa ya........"
        }

    }

    private fun checkNameWhen(name: String?): String {
        //When digunakan untuk nilai fix
        return when (name){
            "Agus" -> "Apakah kamu lahir di Agustus?"
            "Raya" -> "Apakah kamu lahir di hari raya?"
            else -> {
                "Data kamu tidak ada"
            }
        }
    }
    private fun exampleWhen(){
        val contentType = ContentType.REELS
        when(contentType){
            ContentType.PHOTO -> {
                println("konten foto")
            }
            ContentType.VIDEO -> {
                println("konten video")
            }
            ContentType.REELS -> {
                println("konten reels")
            }
        }
    }

    private var name : String? = null
    private fun checkName(){
        //escape condition
        if(name == null) return
        println("Nama anda adalah $name")
        println("Anda adalah pemiliki Google")
    }

    fun printSomething(): Unit {
        //FOR - LOOP 1
        for (index in 0..12){
            if(index == 5)
            println("Ini looping ke : $index")
        }

        //step looping
        for (index in 0..10 step 2){
            println("Ini looping ke : $index")
        }
        //downTo
        for (index in 10 downTo 0 step 2){
            println("Ini looping ke : $index")
        }
        //for manual
        for (index in computerData.indices){
            println(computerData[index])
        }
        //equivalent
        computerData.forEach {
            println("$it")
        }
        computerData.forEachIndexed { index, computerSpec ->
            println("${index + 1}$computerSpec")
        }

        var index = 0
        do {
            println(index)
            index++
        } while (index < 5)

        index = 0
        while (index < 5){
            println(index)
            index++
        }

        //escape and continue
        for (index in 0..12){
            if(index == 5)continue
            println("Ini looping ke : $index")
        }
        // destroy the loop
        for (index in 0..12){
            if(index == 5)break
            println("Ini looping ke : $index")
        }

    }
    
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            ControlFlow().run()
        }
    }
}

enum class ContentType {
    PHOTO, VIDEO, REELS
}