package com.example.forecastapp.model


import com.google.gson.annotations.SerializedName

data class Main(
    var temp: Double, // 282.19
    @SerializedName("feels_like")
    var feelsLike: Double, // 280.47
    @SerializedName("temp_min")
    var tempMin: Double, // 282.19
    @SerializedName("temp_max")
    var tempMax: Double, // 282.19
    var pressure: Int, // 1032
    var humidity: Int, // 43
    @SerializedName("sea_level")
    var seaLevel: Int, // 1032
    @SerializedName("grnd_level")
    var grndLevel: Int // 997
)