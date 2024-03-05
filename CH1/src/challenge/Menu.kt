package challenge

class Menu {
    private val menuItems = listOf(
        Food(
            foodName = "Ayam Bakar",
            foodPrice = 50000
        ),
        Food(
            foodName = "Ayam Goreng",
            foodPrice = 40000
        ),
        Food(
            foodName = "Ayam Geprek",
            foodPrice = 40000
        ),
        Food(
            foodName = "Kulit Ayam Crispy",
            foodPrice = 15000
        ),
        Food(
            foodName = "Sate Usus Ayam",
            foodPrice = 5000
        ),
    )

    private var selectedFood : Food? = null
    fun run(){
        foodList()
        getChooseFood()
    }

    private fun foodList(){
        println("List Menu Makanan")
        println("-------------------------------------")
        for (i in 0 until menuItems.size){
            println("${i+1}. ${menuItems[i].foodName} = Rp ${menuItems[i].foodPrice}")
        }
    }

    private fun getChooseFood(){
        println("Pilih Menu Makanan : ")
        try {
            val selectedIndex = readln().toInt()
            if (selectedIndex in 1..menuItems.size){
                selectedFood = menuItems[selectedIndex - 1]
                println("Pilih Menu Makanan : $selectedFood")
            } else{
                println("Pilihan anda salah, Silakan coba lagi")
                getChooseFood()
            }
        } catch (e : Exception){
            println("Menu makanan anda salah")
        }

    }
}

fun main(args: Array<String>) {
    Menu().run()
}