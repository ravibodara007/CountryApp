package com.example.countryapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("all")
    fun getcountry(): Call<List<CountryModal>>
}