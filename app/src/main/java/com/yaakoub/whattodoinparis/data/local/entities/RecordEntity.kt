package com.yaakoub.whattodoinparis.data.local.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "record_table")
data class RecordEntity(
    @PrimaryKey
    val recordId: String,
    val dataSetId: String,
    val timestamp: String,
    @Embedded(prefix = "field_")
    val fields: FieldEntity,
    @Embedded(prefix = "geometry_")
    val geometry: GeometryEntity
)