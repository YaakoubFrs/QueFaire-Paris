package com.yaakoub.whattodoinparis.data.local

import WTDEntity
import androidx.room.Database
import androidx.room.RoomDatabase
import com.yaakoub.whattodoinparis.data.local.dao.WTDDao

/**
 * The Room database for this app
 */
@Database(entities = [WTDEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wtdDao(): WTDDao
}
