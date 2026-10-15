package com.collection.assessment

//1. Create a Map


//fun main() {
//    val employees = mapOf(
//        101 to "Kuna",
//        102 to "Siva",
//        103 to "Hemanth"
//    )
//
//    println(employees)
//    println("Employee 101: ${employees[101]}")
//    println("Total employees: ${employees.size}")
//}

//==================================================================================

//2. Create a MutableMap


fun main() {
    val employees = mutableMapOf(
        101 to "Kuna", 102 to "Rahul", 103 to "Amit"
    )

    // Add a new employee
    employees[104] = "Sneha"

    // Update an existing employee
    employees[102] = "Rohit"

    // Remove an employee
    employees.remove(103)

    println(employees)
    println("Employee 102: ${employees[102]}")
}
