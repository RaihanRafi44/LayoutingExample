import model.ComputerSpec


class App(var creatorName : String = "Raihan") {
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


    fun run() {
        printHeader()
    }

    private fun printHeader() {
        println("Created By : $creatorName")
        println("=============================")
        println("Order PC App")
        println("=============================")
        computerData.forEach {
            println("${it.processorName} : ${it.EGPUName}")
        }
        /*println("1. Bundle Ryzen 5 + RTX 3060")
        println("2. Bundle Ryzen 9 + RTX 4080")
        println("3. Bundle Intel i7 + RTX 3060")
        println("4. Bundle Intel i9 + RTX 4080")*/
        println("==================================")
        println("Masukkan pilihan anda : ")
        try {
            val userPick = readln().toInt()
            println("Pilihan anda adalah $userPick")
        } catch (e: NumberFormatException) {
            println("Menu Anda Salah")
            printHeader()
        }
    }

    fun main() {
        App().run()
    }
}