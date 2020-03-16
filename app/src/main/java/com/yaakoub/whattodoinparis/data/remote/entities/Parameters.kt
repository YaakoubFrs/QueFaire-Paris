package com.yaakoub.whattodoinparis.data.remote.entities

data class Parameters(
    val dataset: String,
    val facet: List<String>,
    val format: String,
    val rows: Int,
    val timezone: String
)