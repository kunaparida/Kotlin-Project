package com.stream.assesment

fun main() {
    val numbers = listOf(2, 3, 4, 5, 6, 7, 8,10, 55, 23, 78, 90, 45)

    //1. Filter Numbers Greater Than 50

    val result = numbers.filter{it >50}   //numbers.filter { number -> number > 50 }, Can we use a named parameter instead of it?

    println("Numbers Greater Than 50")
    println(result)

    //2.Filter Prime Numbers

    val primes = numbers.filter { isPrime(it) }

    println()
    println("Prime Numbers $primes")

    //3. Filter Strings Starting With "A"

    val names = listOf("Aman", "Sanjay", "Ankit", "Rahul")

    val startsWithA=names.filter { it.startsWith("A") }
    println()
    println("startsWithA $startsWithA")


    //4. Filter Strings Length Greater Than 5

    val words = listOf("Java", "Kotlin", "Android", "API")

    val length5 = words.filter{it.length>5}

    println()
    println("Length Greater Than 5 : $length5")

    //5. Filter Null Values Using filterNotNull()

    val values = listOf("Kotlin", null, "Java", null, "Spring")

    val notNullValues = values.filterNotNull()  //Why use filterNotNull() instead of filter { it != null }?

    println()
    println("notNullValues  : $notNullValues")


    //6.Filter Employees By Salary > 50000

    val employees = listOf( Employee("Kuna", 80000),
        Employee("Aman", 40000),
        Employee("Ravi", 70000))

    val empResult = employees.filter{it.salary>50000}

    println()
    println("Employee Salary > 50000 : $empResult")

    //7. Filter Duplicate Values Then Remove Using distinct()

    val nums = listOf(1, 2, 2, 3, 3, 4, 5)

    val removeDup = nums.filter{number -> nums.count{it == number}>1}.distinct()

    println()
    println("removeDup using distinct : $removeDup")

    //8. Filter Multiples Of 3 And 5

    val numberss = (1..100).toList()

    val res = numberss.filter{it%3==0 && it%5==0}

    println()
    println("Multiples Of 3 And 5 : $res")

    //9.Filter Names Containing "San"

    val namesValue = listOf(
        "Sanjay",
        "Rahul",
        "Santhosh",
        "Kuna",
        "Sandeep"
    )

    val results = namesValue.filter {
        it.contains("San")
    }

    println()
    println("Names Containing San : $results")




}

fun isPrime(num: Int): Boolean {
    if(num<2) return false

    for(i in 2 until num){
        if(num%i==0)
            return false
    }
    return true
}

data class Employee(
    val name: String,
    val salary: Int
)