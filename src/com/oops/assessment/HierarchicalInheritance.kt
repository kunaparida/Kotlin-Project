package com.oops.assessment

import com.oops.assessment.HierarchicalInheritance.Cat
import com.oops.assessment.HierarchicalInheritance.Dog

class HierarchicalInheritance {


    open class Animal {
        fun eat() {
            println("Animal is eating")
        }
    }

    class Dog : Animal() {
        fun bark() {
            println("Dog is barking")
        }
    }

    class Cat : Animal() {
        fun meow() {
            println("Cat is meowing")
        }
    }

}

fun main() {
    val dog = Dog()
    dog.eat()
    dog.bark()

    val cat = Cat()
    cat.eat()
    cat.meow()
}