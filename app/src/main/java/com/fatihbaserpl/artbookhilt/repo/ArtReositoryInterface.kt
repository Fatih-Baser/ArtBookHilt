package com.fatihbaserpl.artbookhilt.repo

import androidx.lifecycle.LiveData

import com.fatihbaserpl.artbookhilt.model.ImageResponse
import com.fatihbaserpl.artbookhilt.roomdp.Art
import com.fatihbaserpl.artbookhilt.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}