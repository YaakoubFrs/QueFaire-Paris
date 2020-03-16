package com.yaakoub.whattodoinparis.data.remote.entities

data class WTDResponse(
    val facet_groups: List<FacetGroup>,
    val nhits: Int,
    val parameters: Parameters,
    val records: List<Record>
)