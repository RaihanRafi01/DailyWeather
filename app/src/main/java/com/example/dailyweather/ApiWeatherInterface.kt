package com.example.dailyweather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiWeatherInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q") city : String,
        @Query("appid") appid  : String,
        @Query("units") units : String
    ) : Call<WeatherAppData>
}