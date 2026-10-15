package com.extension.assesment

fun String.countVowels(): Int {
    return count { it.lowercaseChar() in "aeiou" }
}

fun main() {
    val name = "Kotlin Programming"

    println(name.countVowels())
}
