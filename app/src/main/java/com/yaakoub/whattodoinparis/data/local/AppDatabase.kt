package com.yaakoub.whattodoinparis.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.yaakoub.whattodoinparis.data.local.converters.Converters
import com.yaakoub.whattodoinparis.data.local.dao.RecordDao
import com.yaakoub.whattodoinparis.data.local.dao.WTDDao
import com.yaakoub.whattodoinparis.data.local.entities.RecordEntity
import com.yaakoub.whattodoinparis.data.local.entities.WTDEntity

/**
 * The Room database for this app
 */
@Database(entities = [WTDEntity::class, RecordEntity::class], version = 5, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wtdDao(): WTDDao
    abstract fun recordDao(): RecordDao
}
