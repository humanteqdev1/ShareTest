package com.example.back.sharetest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("---", "onRestoreInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.e("---", "onResume")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.e("---", "onPostResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("---", "onRestart")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.e("---", "onUserInteraction")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("---", "onCreate")


//        val i = Intent("com.android.vending.INSTALL_REFERRER")
//Set Package name
//        i.setPackage("com.digitalfreud")
//referrer is a composition of the parameter of the campaing
//        i.putExtra("referrer", "test_test_ref")
//        val i = Intent("com.android.vending.INSTALL_REFERRER")
//Set Package name
//        i.setPackage("com.digitalfreud")
//referrer is a composition of the parameter of the campaing
//        i.putExtra("referrer", "test_test_ref")
//        sendBroadcast(i2)
        val recv = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                Log.e("---", " test2 $intent")
            }

        }
        registerReceiver(recv, IntentFilter(Intent.ACTION_SEND).apply {
            addAction(Intent.ACTION_SENDTO)
            addAction(Intent.ACTION_ANSWER)
        })
        registerReceiver(ShareReceiver(), IntentFilter(Intent.ACTION_SEND).apply {
            addAction(Intent.ACTION_SENDTO)
            addAction(Intent.ACTION_ANSWER)
        })

        val intent = intent
        val action = intent.action
        val type = intent.type

        if (Intent.ACTION_SEND == action && type != null) {
            if ("text/plain" == type) {
                Log.e("---", " TEXT! $intent")
            } else if (type.startsWith("image/")) {
                Log.e("---", " IMAGE! $intent")
            } else {
                Log.e("---", " UNKNOWN 1! $intent")
            }
        } else if (Intent.ACTION_SEND_MULTIPLE == action && type != null) {
            if (type.startsWith("image/")) {
                Log.e("---", " MULTIPLE! $intent")
            } else {
                Log.e("---", " UNKNOWN 2! $intent")
            }
        } else {

            Log.e("---", " WAT $intent")
        }


//        val task = object : AsyncTask<Void, Void, Void?>() {
//            override fun doInBackground(vararg p0: Void?): Void? {
//
//                try {
//                    val process = Runtime.getRuntime().exec("logcat -d")
//                    val bufferedReader = BufferedReader(
//                            InputStreamReader(process.inputStream))
//
//                    val log = StringBuilder()
//                    var line = bufferedReader.readLine()
//                    while (line != null) {
//                        log.append(line)
//                        line = bufferedReader.readLine()
//                    }
////            val tv = findViewById(R.id.textView1) as TextView
////            tv.text = log.toString()
//
//                    Log.e("---", " " + log.toString())
//                } catch (e: IOException) {
//                    Log.e("---", " exception ${e.message.toString()}")
//                }
//
//                return null
//            }
//
//        }
//
//        task.execute()

//        val am = this.getSystemService(Activity.ACTIVITY_SERVICE) as ActivityManager
//        val tsks = am.appTasks
//        tsks.forEach {
//            val b = it.taskInfo
//            val b2 = b.topActivity
//            val b3 = b2.className
//            val b4 = b2.packageName
//            if(0 == 0) {
//
//            }
//        }
//        val rs = am.getRunningServices(50)
//        if(rs.size == 0) {
//
//        }
//
//
//        val i = Intent(Intent.ACTION_SEND)
//        i.type = "image/*"
//        i.putExtra(Intent.EXTRA_TITLE, "tset s")
//        i.putExtra(Intent.EXTRA_SUBJECT, "teste ")
//        i.putExtra(Intent.EXTRA_TEXT, "test")
//        sendBroadcast(i)
//        val i2 = Intent(Intent.ACTION_SENDTO)
    }
}
