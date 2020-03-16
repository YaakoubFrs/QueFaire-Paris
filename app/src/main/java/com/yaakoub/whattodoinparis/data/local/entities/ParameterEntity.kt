package com.yaakoub.whattodoinparis.data.local.entities

data class ParameterEntity(
    val dataSet: String,
    //val facet: List<String>,
    val format: String,
    val rows: Int,
    val timezone: String
)