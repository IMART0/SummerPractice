package com.example.auto

class LandTransport(modelName: String,
                    maxSpeed: Int,
                    countryOfProduction: String,
                    yearOfProduction: Int,
                    val wheelCount: Int
) : Transport(modelName = modelName,
    maxSpeed = maxSpeed,
    countryOfProduction = countryOfProduction,
    yearOfProduction = yearOfProduction
) {
}