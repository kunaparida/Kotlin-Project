package com.oops.assessment

import com.oops.assessment.MultilevelInheritance.Puppy

class MultilevelInheritance {


    open class Animal {
        fun eat() {
            println("Animal is eating")
        }
    }

    open class Dog : Animal() {
        fun bark() {
            println("Dog is barking")
        }
    }

    class Puppy : Dog() {
        fun weep() {
            println("Puppy is weeping")
        }
    }

}

fun main() {
    val puppy = Puppy()

    puppy.eat()
    puppy.bark()
    puppy.weep()
}