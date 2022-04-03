package com.example.delymo.services

import com.example.delymo.models.BusinessResponse
import retrofit2.http.GET
import retrofit2.Call


interface BusinessApiInterface {
    @GET("/api/v1/business_types.json")
    fun getBusinessList(): Call<BusinessResponse>
}