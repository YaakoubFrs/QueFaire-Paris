package com.yaakoub.whattodoinparis.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yaakoub.whattodoinparis.data.local.entities.WTDEntity

/**
 * The Data Access Object for the WTDEntity class.
 */
@Dao
interface WTDDao {
    @Query("SELECT * FROM place_table")
    fun getPlaces(): LiveData<List<WTDEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg places: WTDEntity)
}
