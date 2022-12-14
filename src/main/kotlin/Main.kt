class Person(var firstName: String, var age: Int){
    
}

fun main(){

    val numbers = listOf(1,2,3,4,5,6)

    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First Element: ${numbers[0]}")
    println("Second Element: ${numbers[1]}")
    println("Last Index: ${numbers.size - 1}")
    println("Last Element: ${numbers[numbers.size - 1]}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")
}