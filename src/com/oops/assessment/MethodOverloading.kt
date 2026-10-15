package com.oops.assessment

import com.oops.assessment.MethodOverloading.Calculator

class MethodOverloading {

    //When a class has multiple methods with the same name but different parameters,
    // it is called method overloading.


    class Calculator {

        fun add(a: Int, b: Int): Int {
            return a + b
        }

        fun add(a: Int, b: Int, c: Int): Int {
            return a + b + c
        }

        fun add(a: Double, b: Double): Double {
            return a + b
        }
    }

}
fun main() {
    val calculator = Calculator()

    println(calculator.add(10, 20))
    println(calculator.add(10, 20, 30))
    println(calculator.add(10.5, 20.5))
}