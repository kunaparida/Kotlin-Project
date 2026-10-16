package com.stream.assesment

fun main(){

//    1. Sum Of Numbers

    val numbers = listOf(10, 20, 30, 40)

    val sum = numbers.reduce { acc, next -> acc+next }  //we can use loop instead of reduce

    println()
    println("Sum : $sum")

    //2.Find Maximum Number

    val number = listOf(10, 50, 30, 80, 40)

    val maximum = number.reduce{acc, next-> if(acc>next) acc else next}

    println()
    println("Maximum : $maximum")

    //3. Find Product Of Numbers

    val nums = listOf(1, 2, 3, 4, 5)

    val product = nums.reduce { acc, num ->
        acc * num
    }

    println()
    println("Product: $product")

    //4. Sum Employee Salaries

    val employees = listOf(
        Employee("Aman", 50000),
        Employee("Ravi", 60000),
        Employee("John", 70000)
    )

    val totalSalary = employees
        .map { it.salary }
        .reduce { acc, salary ->
            acc + salary
        }

    println()
    println("totalSalary: $totalSalary")

//    5. Merge Multiple Lists

    val lists = listOf(
        listOf(1, 2),
        listOf(3, 4),
        listOf(5, 6)
    )

    val merged = lists.reduce { acc, list ->
        acc + list
    }

    println()
    println("merged : $merged")

}

data class EmployeeNew(
    val name: String,
    val salary: Int
)