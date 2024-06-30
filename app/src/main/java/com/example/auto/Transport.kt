package com.example.auto

open class Transport(val modelName: String,
                     val maxSpeed: Int,
                     val countryOfProduction: String,
                     val yearOfProduction: Int
    ) {
    fun printInfo() {
        println("$modelName произведён в $countryOfProduction в $yearOfProduction году. " +
                "Максимальная скорость: $maxSpeed км/час")
    }
}