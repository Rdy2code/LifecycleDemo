package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

class ClickerApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        //Initialize Timber for use throughout the app
        Timber.plant(Timber.DebugTree())
    }
}