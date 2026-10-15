package com.oops.assessment

class MethodOverriding {

    //When a child class provides its own implementation of a method inherited from a parent class,
    // it is called method overriding

    open class Animal{
        open fun sound(){
            println("Animal male Sound")
        }
    }

    class Dog : Animal(){
        override fun sound(){
            println("Dog Barks")
        }
    }

    class Cat : Animal(){
        override fun sound(){
            println("Cat Mewouns")
        }
    }
}

fun main() {
    val animal = MethodOverriding.Animal()
    animal.sound()

    val dog = MethodOverriding.Dog()
    dog.sound()

    val cat = MethodOverriding.Cat()
    cat.sound()
}