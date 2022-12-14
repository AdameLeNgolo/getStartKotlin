//class Person(var firstName: String, var age: Int){
//
//}

open class Item (val name: String, val price: Int)

class Noodles: Item("Noodles",10){
    override fun toString(): String {
        return name
    }
}
class Vegetables(vararg val toppings: String) : Item("Vegetables",5){
    override fun toString(): String {
        if (toppings.isEmpty()){
            return "$name Chef's Choice"
        }else{
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int){
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order{
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order{
        itemList.addAll(newItems)
        return this
    }

    fun print(){
        println("Order #${orderNumber}")
        var total = 0

        for (item in itemList){
            println("${item}: $${item.price}")
            total+=item.price
        }
        println("Total: $${total}")
    }
}

fun main(){

    /*val numbers = listOf(1,2,3,4,5,6)

    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First Element: ${numbers[0]}")
    println("Second Element: ${numbers[1]}")
    println("Last Index: ${numbers.size - 1}")
    println("Last Element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")*/

/*    val entrees = mutableListOf<String>()
    val entrees : MutableList<String> = mutableListOf()

    println("Add noodles: ${entrees.add("noodles")}")
    println("Add spaghetti: ${entrees.add("spaghetti")}")

    val moreItems = listOf("rivioli","lasagna","fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Remove first element: ${entrees.removeAt(0)}")

    println("Entrees: $entrees")

    entrees.clear()
    println("Entrees: $entrees")

    println("Empty ?: ${entrees.isEmpty()}")*/

    /*val noodles = Noodles()
    val vegetables1 = Vegetables(listOf("Cabbage","Sprouts","Onion"))
    val vegetables2 = Vegetables()

    println(noodles)
    println(vegetables1)
    println(vegetables2) */

    val orderList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    orderList.add(order1)

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    orderList.add(order2)

    val order3 = Order(2)
    val items = listOf(Noodles(),Vegetables("Carrots","Beans","Celery"))
    order3.addAll(items)
    orderList.add(order3)

    val order4 = Order(4).addItem(Noodles()).addItem(Vegetables("Cabbage","Onion"))
    orderList.add(order4)

    orderList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )

    for (order in orderList){
        order.print()
        println()
    }

}