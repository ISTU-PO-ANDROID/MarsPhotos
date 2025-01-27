package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApiService

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        val listPhotos = marsApiService.getPhotos()
        val updatedList = listPhotos.map { photo ->
            MarsPhoto(photo.id, photo.imgSrc.replace(".jpl", ""))
        }
        return updatedList

//        return marsApiService.getPhotos()
    }
}