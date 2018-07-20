package com.example.back.sharetest

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log

class WidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context?, appWidgetManager: AppWidgetManager?, appWidgetIds: IntArray?) {
        super.onUpdate(context, appWidgetManager, appWidgetIds)
        Log.e("---", "onUpdate")

        val recv = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Log.e("---", " test3 $p1")
            }

        }
//        context?.registerReceiver(recv, IntentFilter(Intent.ACTION_SEND).apply {
//            addAction(Intent.ACTION_SENDTO)
//            addAction(Intent.ACTION_ANSWER)
//        })
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
        val recv = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Log.e("---", " test4 $p1")
            }

        }

//        context?.registerReceiver(recv, IntentFilter(Intent.ACTION_SEND).apply {
//            addAction(Intent.ACTION_SENDTO)
//            addAction(Intent.ACTION_ANSWER)
//        })

        Log.e("---", "onReceive")
    }

    override fun onRestored(context: Context?, oldWidgetIds: IntArray?, newWidgetIds: IntArray?) {
        super.onRestored(context, oldWidgetIds, newWidgetIds)
        Log.e("---", "onRestored")
    }

    override fun onEnabled(context: Context?) {
        super.onEnabled(context)
        Log.e("---", "onEnabled")
    }

    override fun onDisabled(context: Context?) {
        super.onDisabled(context)
        Log.e("---", "onDisabled")
    }

    override fun onDeleted(context: Context?, appWidgetIds: IntArray?) {
        super.onDeleted(context, appWidgetIds)
        Log.e("---", "onDeleted")
    }

    override fun onAppWidgetOptionsChanged(context: Context?, appWidgetManager: AppWidgetManager?, appWidgetId: Int, newOptions: Bundle?) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions)

        Log.e("---", "onAppWidgetOptionsChanged")
    }
}