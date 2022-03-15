package com.example.forecastapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.forecastapp.databinding.ActivityMainBinding
import com.example.forecastapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fetchData()
    }



    @SuppressLint("SetTextI18n")
    fun fetchData(){
        viewModel.weatherResp.observe(this) { weather ->

            binding.apply {
                temperature.text =
                    (weather.main.temp.toInt() - 273).toString() + getString(R.string.celcius)
                descrition.text = weather.weather[0].description
                wind.text = "Wind speed: " + weather.wind.speed.toString() + getString(R.string.speed)
                tempmaxValue.text =
                    (weather.main.tempMax.toInt() - 273).toString() + getString(R.string.celcius)
                tempminValue.text =
                    (weather.main.tempMin.toInt() - 273).toString() + getString(R.string.celcius)
                feelsLike.text =
                    (weather.main.feelsLike.toInt() - 273).toString() + getString(R.string.celcius)
                humidity.text = weather.main.humidity.toString() + "%"


            }

        }
    }
}