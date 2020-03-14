package com.yaakoub.whattodoinparis.data.local.dao

import WTDEntity
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * The Data Access Object for the WTDEntity class.
 */
@Dao
interface WTDDao {
    @Query("SELECT * FROM what_to_do_in_paris ORDER BY nhits")
    fun getPlants(): LiveData<List<WTDEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg plants: WTDEntity)
}
