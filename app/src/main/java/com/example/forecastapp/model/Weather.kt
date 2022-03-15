package com.example.forecastapp.model


import com.google.gson.annotations.SerializedName

data class Weather(
    var coord: Coord,
    var weather: List<WeatherX>,
    var base: String, // stations
    var main: Main,
    var visibility: Int, // 10000
    var wind: Wind,
    var clouds: Clouds,
    var dt: Int, // 1647338236
    var sys: Sys,
    var timezone: Int, // 7200
    var id: Int, // 702550
    var name: String, // Lviv
    var cod: Int // 200
)