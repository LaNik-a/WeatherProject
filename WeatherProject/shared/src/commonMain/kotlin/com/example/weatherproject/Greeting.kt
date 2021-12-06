package com.example.weatherproject

class Greeting {
    fun greeting(): String {
        return "Guess what it is! > ${Platform().platform.reversed()}!"
    }

    fun getSystemName() = Platform().systemName
}