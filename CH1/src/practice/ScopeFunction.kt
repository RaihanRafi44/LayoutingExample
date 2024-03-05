package practice

import app.model.ComputerSpec

class ScopeFunction{

    private val creatorName : String? = null
    private var computerData : ComputerSpec? = null

    fun run(){
        //let
        creatorName?.let {
            println("Created by : $creatorName")
        } ?: run{
            println("This program is open source")
        }
        println(computerData)
        //apply
        computerData?.apply {
            this.processorName = "Intel Pentium"
        } ?: run{
            println("Computer Data is null")
        }
        computerData = ComputerSpec(
            processorName = "Intel i9",
            processorTotalCore = 8,
            isHaveIGPU = true,
            totalRamInGB = 32,
            EGPUName = "RTX 4060"
        )
        computerData?.apply {
            this.processorName = "Intel Pentium"
        } ?: run{
            println("Computer Data is null")
        }
        println(computerData)

        //with
        //before
        println(computerData?.processorName)
        println(computerData?.totalRamInGB)
        println(computerData?.isHaveIGPU)

        //after
        with(computerData){
            println(this?.processorName)
            println(this?.totalRamInGB)
            println(this?.totalRamInGB)
        }
    }
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            ScopeFunction().run()
        }
    }
}