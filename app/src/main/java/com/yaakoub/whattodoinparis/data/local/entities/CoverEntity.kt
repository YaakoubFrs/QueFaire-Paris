package com.yaakoub.whattodoinparis.data.local.entities

data class CoverEntity(
    val id: String,
    //val colorSummary: List<String>,
    val filename: String,
    val format: String,
    val height: Int,
    val mimeType: String,
    val thumbnail: Boolean,
    val width: Int
)