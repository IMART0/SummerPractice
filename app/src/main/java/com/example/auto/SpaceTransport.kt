package com.example.auto

class SpaceTransport(modelName: String,
                      maxSpeed: Int,
                      countryOfProduction: String,
                      yearOfProduction: Int,
                      val orbitType: String
) : Transport(modelName = modelName,
    maxSpeed = maxSpeed,
    countryOfProduction = countryOfProduction,
    yearOfProduction = yearOfProduction
) {
}