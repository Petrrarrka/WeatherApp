package com.example.forecastapp.repository

import com.example.forecastapp.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){

    suspend fun getWeather() = apiService.getWeather()

}