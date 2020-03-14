package com.fevziomurtekin.di

import androidx.room.Room
import com.yaakoub.whattodoinparis.data.local.AppDatabase
import com.yaakoub.whattodoinparis.utils.DATABASE_NAME
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.applicationContext

/**
 * App Compenents
 */

val appModule = applicationContext {

    /*viewModel { CommitViewModel(get()) }

    // CommitRepository providers.
    bean { CommitRepositoryImpl(get(), get()) as CommitRepository }
    */
    // provider to Room database.
    bean {
        Room.databaseBuilder(androidApplication(), AppDatabase::class.java, DATABASE_NAME)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
    /*
    bean { ApplicationSchedulerProvider() as SchedulerProvider }

    // Expose CommitDao directly
    bean { get<CommitDatabase>().commitDao() }*/

}

// Gather all app modules.
val onlineCommitApp = listOf(appModule, remoteModule)