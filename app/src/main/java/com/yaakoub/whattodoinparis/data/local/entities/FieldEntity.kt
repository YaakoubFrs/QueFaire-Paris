package com.yaakoub.whattodoinparis.data.local.entities

import androidx.room.Embedded

data class FieldEntity(
    val id: String,
    val title: String,
    val category: String,
    val tags: String,
    val accessType: String,
    val description: String,
    val dateDescription: String,
    val transport: String,
    val priceDetail: String,
    val priceType: String,
    val blind: Int,

    @Embedded(prefix = "cover_")
    val cover: CoverEntity,
    val coverUrl: String,
    val url: String,

    val dateStart: String,
    val dateEnd: String,
    val updatedAt: String,

    val addressCity: String,
    val addressName: String,
    val addressStreet: String,
    val addressZipCode: String,

    val contactFacebook: String,
    val contactMail: String,
    val contactName: String,
    val contactPhone: String,
    val contactUrl: String,

    val deaf: Int,
    //val latLon: List<Double>,
    val leadText: String,
    val occurrences: String,
    val pmr: Int
)