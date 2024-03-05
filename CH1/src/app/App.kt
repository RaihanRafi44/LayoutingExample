package app

import app.model.ComputerSpec

class App(var creatorName : String? = null) {

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
        ), //Computer 2
        ComputerSpec(
            processorName = "Intel i3",
            processorTotalCore = 6,
            isHaveIGPU = false,
            totalRamInGB = 16,
            EGPUName = "RTX 2080"
        ) //Computer 2
    )
    private var selectedComputer : ComputerSpec? = null

    fun run() {
        printHeader()
        getSelectedComputer()
    }
    private fun printHeader() {
        println("=============================")
        println("Created by : $creatorName")
        println("=============================")
        println("Order PC App")
        println("=============================")
        computerData.forEachIndexed { index, data ->
            println("${index + 1}.${data.processorName} : ${data.EGPUName}")
        }
        println("==================================")

    }
    private fun getSelectedComputer(){
        println("Masukkan pilihan anda : ")
        try {
            val selectedIndex = readln().toInt()
            if (selectedIndex in 1..computerData.size){
                selectedComputer = computerData[selectedIndex - 1]
                println("Pilihan komputer anda : $selectedComputer")
            } else{
                println("Pilihan anda salah, Silakan coba lagi")
                getSelectedComputer()
            }

        } catch (e: Exception) {
            println("Menu Anda Salah")
            getSelectedComputer()
        }
    }
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            App("Raihan").run()
        }
    }

}

