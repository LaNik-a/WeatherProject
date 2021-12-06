package com.example.weatherproject

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        // "Guess what it is! > ${Platform().platform.reversed()}!"
        assertTrue(Greeting().greeting().contains("SOi"), "Check iOS is mentioned")
    }
}