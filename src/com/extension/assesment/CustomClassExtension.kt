package com.extension.assesment


class SalariedEmployee(val name: String, val monthlySalary: Int)

fun SalariedEmployee.annualSalary(): Int {
    return monthlySalary * 12
}

fun main() {
    val employee = SalariedEmployee("Kuna", 50000)

    println(employee.name)
    println(employee.annualSalary())
}

