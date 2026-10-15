package com.arrays.assesment

import kotlin.compareTo


fun main() {
    val numbers = arrayOf(10, 25, 5, 40, 15)

    //1.Create and print an array

    println("Print arrays: ${numbers.contentToString()}")

    //=====================================================================================

    //2.Traverse an array using a for loop
    println()
    println("Traverse an array using a for loop")

    for (number in numbers) {
        println(number)
    }
    //The loop visits each element and stores its value in number

    // =====================================================================================

    //3.Traverse using forEach

    numbers.forEach{number -> println(number)}

   //Note: forEach performs an operation for every element. Here, it prints each number. number is the current element.

  //=====================================================================================

    //4.Print array elements using indices
    println()
    println("Print array elements using indices")

    for(i in numbers.indices ){
        println("index $i = ${numbers[i]}")
    }
    //Array indices start at 0. numbers.indices gives all valid indices,
    // and numbers[i] accesses the element at index i

    //=====================================================================================

    //5.Find the largest element

    println()
    val largest =numbers.maxOrNull()

    println("Largest number: $largest")

    //Other approch using loop
    println()

    var largest1 =numbers[0]

    for(number in numbers){
        if(number > largest1){
            largest1 = number
        }
    }

    println("Largest Number : ${largest1}")

    //This sorts the array in ascending order and takes the last element.

    //=====================================================================================

    //6. Find the smallest element
    println()

    val smallest = numbers.minOrNull()

    println("Smallest Number = $smallest")

    // using for loop

    var smallest1 = numbers[0]

    for(number in numbers){
        if(number < smallest1)
        {
            smallest1 = number
        }
    }
    println("The smallest value is $smallest1")

    //=====================================================================================

    //7. Calculate the sum of elements
    println()

    val sum = numbers.reduce { sum , next -> sum+next }

//    val sum = numbers.sum()

    println("Sum is $sum")

    //=====================================================================================

    //8. Calculate the average
    println()

    val average = numbers.average()

    println("Average number is $average")

    //=====================================================================================

    //9. Find the second largest number
    println()

    val secondLargest = numbers.distinct().sortedDescending().getOrNull(1)

    println("secondLargest is $secondLargest")

    //using for loop approch




        var largestt = Int.MIN_VALUE
        var secondLargest1 = Int.MIN_VALUE

        for (number in numbers) {
            if (number > largestt) {
                secondLargest1 = largestt
                largestt = number
            } else if (number > secondLargest1 && number < largestt) {
                secondLargest1 = number
            }
        }

        println("Second largest is $secondLargest1")


    //=====================================================================================


    //10. Find the second smallest number
    println()

    val secondSmallest = numbers
        .distinct()
        .sorted()
        .getOrNull(1)

    println("Second smallest: $secondSmallest")

    //Using for loop

    var smallest2 = Int.MAX_VALUE
    var secondSmallest2 = Int.MAX_VALUE

    for (number in numbers) {
        if (number < smallest2) {
            secondSmallest2 = smallest2
            smallest2 = number
        } else if (number > smallest2 && number < secondSmallest2) {
            secondSmallest2 = number
        }
    }

    println("Second smallest: $secondSmallest2")

}
