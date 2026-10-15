package com.collection.assessment

//1. Create a HashSet


fun main() {
    val numbers = hashSetOf(10, 20, 10, 30, 20, 40)

    println(numbers)
    println("Size: ${numbers.size}")
}

//======================================================================================

//2. Create a MutableSet


//fun main() {
//    val numbers = mutableSetOf(10, 20, 30)
//
//    numbers.add(40)
//    numbers.add(20)
//    numbers.remove(10)
//
//    println(numbers)
//}

//======================================================================================

//3. Remove duplicates using Set


//fun main() {
//    val numbers = arrayListOf(10, 20, 10, 30, 20, 40)
//
//    val uniqueNumbers = numbers.toSet()
//
//    println("Original list: $numbers")
//    println("Unique numbers: $uniqueNumbers")
//}
