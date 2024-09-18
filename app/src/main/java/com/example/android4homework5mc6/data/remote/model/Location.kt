package com.example.android4homework5mc6.data.remote.model

import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String? = null
)
