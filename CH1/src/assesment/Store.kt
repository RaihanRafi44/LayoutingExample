package assesment

class Store() {
    private val fruitsList = listOf(
        Fruits(
            fruitsName = "Melon",
            fruitsPrice = 20000
        ),
        Fruits(
            fruitsName = "Apple",
            fruitsPrice = 6000
        ),
        Fruits(
            fruitsName = "Mango",
            fruitsPrice = 10000
        ),
        Fruits(
            fruitsName = "Avocado",
            fruitsPrice = 8000
        ),
        Fruits(
            fruitsName = "Watermelon",
            fruitsPrice = 21000
        )
    )
    private var selectedFruits: Fruits? = null
    fun run() {
        printFruitList()
        getFruits()
        selectedFruits?.let { selectedFruit ->
            val quantity = countFruits(selectedFruit)
            val totalPrice = selectedFruit.fruitsPrice * quantity.toFloat()
            println("Total price = $totalPrice")
            bonusFruits(totalPrice)
        }
    }
    private fun printFruitList() {
        println("===============================")
        println("Welcome to Fruit Store !")
        println("===============================")
        println("Our Fruits Today :")
        for (i in 0 until fruitsList.size) {
            println("${i + 1}. ${fruitsList[i].fruitsName} = Rp ${fruitsList[i].fruitsPrice}")
        }
    }

    private fun getFruits() {
        println("What do you want to buy? 1/2/3/4/5")
        try {
            val selectedIndex = readLine()?.toInt() ?: 0
            if (selectedIndex in 1..fruitsList.size) {
                selectedFruits = fruitsList[selectedIndex - 1]
                println("You selected ${selectedFruits?.fruitsName}")
            } else {
                println("You input wrong value")
                getFruits()
            }
        } catch (e: Exception) {
            println("You input wrong value")
            getFruits()
        }
    }

    private fun countFruits(selectedFruits: Fruits?): Int {
        // Memeriksa apakah selectedFruits tidak null
        if (selectedFruits != null) {
            println("...........................")
            println("How many ${selectedFruits.fruitsName} you wanna buy?")
            try {
                // Membaca masukan pengguna dan mengonversinya menjadi bilangan bulat
                val input = readLine()
                if (input != null) {
                    return input.toInt()
                }
            } catch (e: Exception) {
                println("You input wrong value")
            }
        }
        return 0
    }

    private fun bonusFruits(totalPrice: Float) {
        // implement bonus of fruits from total price
        val totalPriceInt   = totalPrice.toInt()
        /*when {
            totalPrice in 100000 until 150000 -> println("You got 1 watermelon")
            totalPrice in 150000 until 200000 -> println("You got 2 melons")
            totalPrice in 200000 until 250000 -> println("You got 6 avocados")
            totalPrice >= 250000 -> println("You got 1 KG apple")
            else -> println("You don't get any bonus")
        }*/
        if(totalPriceInt in 100000 until 150000) {
            println("You got 1 watermelon")
        }
        else if(totalPriceInt in 150000 until 200000) {
            println("You got 2 melons")
        }
        else if(totalPriceInt in 200000 until 250000) {
            println("You got 6 avocados")
        }
        else if(totalPriceInt >= 250000) {
            println("You got 1 KG apple")
        }
        else {
            println("You don't get any bonus")
        }
    }
}

fun main(args: Array<String>) {
    Store().run()
}
