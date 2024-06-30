package com.example.auto

import kotlin.random.Random

open class TranportCreator {
    companion object {
        fun createRandomTranport(): Transport {
            val years = Random.nextInt(1960, 2024)
            val randomIndex = Random.nextInt(0, 4)
            val country = arrayOf("USA", "Germany", "Japan", "Italy", "Russia", "Armenia").random()
            val maxSpeed = Random.nextInt(10, 1000)

            return when (randomIndex) {
                0 -> AirTransport(
                    arrayOf("Boeing 747", "Airbus A320", "Cessna 172", "Antonov An-225").random(),
                    maxSpeed,
                    country,
                    years,
                    Random.nextDouble(10.0, 1000.0)
                )

                1 -> LandTransport(
                    arrayOf(
                        "Tesla Model S",
                        "BMW X5",
                        "Honda Civic",
                        "Ford F-150",
                        "Toyota Land Cruiser"
                    ).random(), maxSpeed, country, years, Random.nextInt(1, 10)
                )

                2 -> WaterTransport(
                    arrayOf(
                        "Speedboat X200",
                        "Bayliner Element",
                        "Yamaha 242X E-Series",
                        "Princess V65"
                    ).random(),
                    maxSpeed,
                    country,
                    years,
                    arrayOf("Sail", "Petrol", "Electric").random()
                )

                else -> SpaceTransport(
                    arrayOf(
                        "Apollo 11",
                        "SpaceX Starship",
                        "Soyuz MS-20",
                        "Blue Origin New Shepard"
                    ).random(),
                    maxSpeed,
                    country,
                    years,
                    arrayOf("Near-Earth", "Geostationary", "Equatorial").random()
                )
            }
        }
    }
}