package model

data class ComputerSpec(
    val processorName : String,
    val processorTotalCore : Int,
    val isHaveIGPU : Boolean,
    val totalRamInGB : Int,
    val EGPUName : String
)
