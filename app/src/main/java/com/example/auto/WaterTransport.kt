package com.example.auto

class WaterTransport(modelName: String,
                     maxSpeed: Int,
                     countryOfProduction: String,
                     yearOfProduction: Int,
                     val engineType: String
) : Transport(modelName = modelName,
    maxSpeed = maxSpeed,
    countryOfProduction = countryOfProduction,
    yearOfProduction = yearOfProduction
) {
}