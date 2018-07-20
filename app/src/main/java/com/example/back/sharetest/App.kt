package com.example.back.sharetest

import android.app.Application
import android.content.ComponentCallbacks
import android.content.Intent
import android.content.IntentSender
import android.content.res.Configuration
import android.os.UserHandle
import android.util.Log

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("---", "app onCreate")
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
        Log.e("---", "onConfigurationChanged")
    }

    override fun startIntentSender(intent: IntentSender?, fillInIntent: Intent?, flagsMask: Int, flagsValues: Int, extraFlags: Int) {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags)
        Log.e("---", "startIntentSender")
    }

    override fun registerComponentCallbacks(callback: ComponentCallbacks?) {
        super.registerComponentCallbacks(callback)
        Log.e("---", "registerComponentCallbacks")
    }

    override fun registerOnProvideAssistDataListener(callback: OnProvideAssistDataListener?) {
        super.registerOnProvideAssistDataListener(callback)
        Log.e("---", "registerOnProvideAssistDataListener")
    }

    override fun sendStickyBroadcastAsUser(intent: Intent?, user: UserHandle?) {
        super.sendStickyBroadcastAsUser(intent, user)
    }
}