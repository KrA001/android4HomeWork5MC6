package com.example.android4homework5mc6.data.remote.locationmodel

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("next")
    val next: String,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("prev")
    val prev: Int? = null,
    @SerializedName("count")
    val count: Int = 0
)
