package com.example.android4homework5mc6.data.repository

import com.example.android4homework5mc6.data.remote.RetrofitClient

class RickAndMortyRepository {

    private val apiService = RetrofitClient.rickAndMortyApiService

    suspend fun getCharacter() = apiService.getCharacters()

    suspend fun getLocation() = apiService.getLocations()
}