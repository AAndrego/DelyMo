package com.example.delymo.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class BusinessResponse(
    @SerializedName("business_types")
    val Business : List<Business>
): Parcelable {
    constructor() : this(mutableListOf())
}