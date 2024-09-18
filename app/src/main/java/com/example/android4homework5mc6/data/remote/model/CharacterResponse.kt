package com.example.android4homework5mc6.data.remote.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("results")
    val results: List<ResultItemCharacter>?,
    @SerializedName("info")
    val info: Info
)
