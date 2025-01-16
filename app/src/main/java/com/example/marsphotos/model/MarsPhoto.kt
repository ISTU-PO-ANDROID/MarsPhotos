package com.example.marsphotos.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@JsonClass(generateAdapter = true)
data class MarsPhoto(
    val id: String,
    @Json(name = "img_src")
    val imgSrc: String
)
