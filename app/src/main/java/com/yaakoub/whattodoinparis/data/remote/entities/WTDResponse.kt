package com.yaakoub.whattodoinparis.data.remote.entities

data class WTDResponse(
    val nhits: Int,
    val parameters: Parameters,
    val records: List<Record>
)