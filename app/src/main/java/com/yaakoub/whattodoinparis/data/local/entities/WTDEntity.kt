package com.yaakoub.whattodoinparis.data.local.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "place_table")
data class WTDEntity(
    @PrimaryKey val nHits: Int,
    @Embedded(prefix = "params_")
    val parameters: ParameterEntity
)