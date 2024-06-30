package com.example.auto

class AirTransport(modelName: String,
                    maxSpeed: Int,
                    countryOfProduction: String,
                    yearOfProduction: Int,
                    val maxTakeoffWeight: Double,

) : Transport(modelName = modelName,
    maxSpeed = maxSpeed,
    countryOfProduction = countryOfProduction,
    yearOfProduction = yearOfProduction
) {
}