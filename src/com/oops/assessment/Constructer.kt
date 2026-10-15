package com.oops.assessment


//Primary Constructer

//class Employee(val name: String, val salary: Int)
//
//fun main() {
//    val employee = Employee("Kuna", 50000)
//
//    println(employee.name)
//    println(employee.salary)
//}

//Secondary Constructor

//class Employee {
//    var name: String
//    var salary: Int
//
//    constructor(name: String, salary: Int) {
//        this.name = name
//        this.salary = salary
//    }
//
//    constructor(name: String) {
//        this.name = name
//        this.salary = 25000
//    }
//}
//
//fun main() {
//    val employee1 = Employee("Kuna", 50000)
//    val employee2 = Employee("Rahul")
//
//    println("${employee1.name}  ${employee1.salary}")
//    println("${employee2.name}  ${employee2.salary}")
//}

//Constructor with init block

class Employee(val name: String, val salary: Int) {

    init {
        println("Employee object is being created")
        require(salary > 0) { "Salary must be greater than zero" }
    }
}

fun main() {
    val employee = Employee("Kuna", 50000)

    println(employee.name)
    println(employee.salary)
}

