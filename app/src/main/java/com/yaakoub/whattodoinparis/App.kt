package com.yaakoub.whattodoinparis

import android.app.Application
import com.fevziomurtekin.di.onlineCommitApp
import org.koin.android.ext.android.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, onlineCommitApp)

    }
}