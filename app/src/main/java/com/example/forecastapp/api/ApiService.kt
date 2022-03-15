package com.example.forecastapp.api

import com.example.forecastapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather?q=Lviv&appid=6d23d23edfab93049ca0145ef1d00946")
    suspend fun getWeather(): Response<Weather>
}
