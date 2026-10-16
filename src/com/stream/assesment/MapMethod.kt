package com.stream.assesment


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    //1. Square Every Number

    val squares = numbers.map { it * it }

    println("squares of Numbers : $squares")

    //2. Convert Names To Uppercase

    val names = listOf("aman", "ravi", "john")

    val results = names.map { it.uppercase() }

    println()
    println("Names in UpperCase : $results")

    //3. Extract Employee Names

    val employees = listOf(
        Employee("Kuna", 50000),
        Employee("Ravi", 60000),
        Employee("John", 70000)
    )

    val empNames = employees.map { it.name }

    println()
    println("Employees of Names : $empNames")

    //4. Convert List Of Strings To Lengths

    val words = listOf(
        "Kotlin",
        "Java",
        "Android"
    )

    val length = words.map{it.length}

    println()
    println("String length : $length")

    //5. Add Prefix(Mr.) To Every Name

    val namesVal = listOf("Aman", "Ravi", "John")

    val resultss = namesVal.map{"Mr. $it"}

    println()
    println("Names Val : $resultss")

    //6. Convert Celsius To Fahrenheit

    val celsius = listOf(
        0.0,
        25.0,
        100.0
    )

    val fahrenheit = celsius.map {
        (it * 9 / 5) + 32
    }

    println()
    println("Fahrenheit Value : $fahrenheit")

//    7. Create DTO Objects From Entities

    val employees1 = listOf(
        Employee1("Kuna", 50000),
        Employee1("Ravi", 60000)
    )

    val dtos = employees.map {
        Employee1Dto(it.name,it.salary)
    }

    println()
    println("DTO Objects : $dtos")




}


data class Employee1(
    val name: String,
    val salary: Int
)

data class Employee1Dto(
    val name: String,
    val salary: Int
)