package com.example.delymo.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BusinessApiService {
    companion object {
        private const val BASE_URL = "https://www.dely.com.co/"
        private var retrofit : Retrofit? = null

        fun getInstance() : Retrofit{
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}