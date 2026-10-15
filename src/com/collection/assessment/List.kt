package com.collection.assessment


//    1. Create an immutable list using listOf()

    fun main() {
        val numbers = listOf(10, 20, 30, 40, 50)

        println(numbers)
        println(numbers[0])
    }

//========================================================================================

//2. Create a mutable list using mutableListOf()

//fun main() {
//    val numbers = mutableListOf(10, 20, 30)
//
//    numbers.add(40)
//    numbers.remove(10)
//
//    println(numbers)
//}

//========================================================================================


//3. Create an ArrayList

//fun main() {
//    val numbers = ArrayList<Int>()
//
//    numbers.add(10)
//    numbers.add(20)
//    numbers.add(30)
//
//    println(numbers)
//}

//========================================================================================

//4. Add multiple elements

//fun main() {
//    val numbers = mutableListOf(10, 20)
//
//    numbers.addAll(listOf(30, 40, 50))
//
//    println(numbers)
//}

//========================================================================================

//5. Remove duplicates from an ArrayList

// fun main() {
//    val numbers = arrayListOf(10, 20, 10, 30, 20, 40)
//
//    val uniqueNumbers = numbers.distinct()
//
//    println(uniqueNumbers)
// }

//Using loop

//fun main() {
//    val numbers = arrayListOf(10, 20, 10, 30, 20, 40)
//    val uniqueNumbers = arrayListOf<Int>()
//
//    for (number in numbers) {
//        if (number !in uniqueNumbers) {
//            uniqueNumbers.add(number)
//        }
//    }
//
//    println(uniqueNumbers)
//}
