package com.yaakoub.whattodoinparis.data.remote.entities

data class Cover(
    val color_summary: List<String>,
    val filename: String,
    val format: String,
    val height: Int,
    val id: String,
    val mimetype: String,
    val thumbnail: Boolean,
    val width: Int
)