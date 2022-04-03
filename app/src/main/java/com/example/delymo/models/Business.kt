package com.example.delymo.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Business(

    @SerializedName("id")
    val id : String?,


    @SerializedName("name")
    val name: String?,

    @SerializedName("image")
    val image: String?
) : Parcelable{
    constructor() : this("", "", "")
}
