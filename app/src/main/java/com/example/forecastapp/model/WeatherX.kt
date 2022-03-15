package com.example.forecastapp.model


import com.google.gson.annotations.SerializedName

data class WeatherX(
    var id: Int, // 803
    var main: String, // Clouds
    var description: String, // broken clouds
    var icon: String // 04d
)