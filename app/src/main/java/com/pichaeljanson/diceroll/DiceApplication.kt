package com.pichaeljanson.diceroll

import android.app.Application
import timber.log.Timber

class DiceApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}