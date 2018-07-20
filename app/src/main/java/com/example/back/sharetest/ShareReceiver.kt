package com.example.back.sharetest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class ShareReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.e("---", " test $intent")
    }
}
