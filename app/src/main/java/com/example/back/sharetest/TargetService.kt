package com.example.back.sharetest

import android.annotation.TargetApi
import android.content.ComponentName
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.os.IBinder
import android.service.chooser.ChooserTarget
import android.service.chooser.ChooserTargetService
import android.util.Log


@TargetApi(Build.VERSION_CODES.M)
class TargetService : ChooserTargetService() {


    override fun onBind(intent: Intent?): IBinder {
        Log.e("---", "onBind $intent " +
                " data: ${intent?.data}\n" +
                " action: ${intent?.action}\n " +
                " clipData: ${intent?.clipData}\n " +
                " component: ${intent?.component}\n" +
                " dataString: ${intent?.dataString}\n" +
                " extras: ${intent?.extras} \n" +
                " package: ${intent?.`package`} \n" +
                " scheme: ${intent?.scheme} \n" +
                " selector: ${intent?.selector} \n" +
                " sourceBounds: ${intent?.sourceBounds} \n" +
                " extraText: ${intent?.getStringExtra(Intent.EXTRA_TEXT)} \n" +
                " stream: ${intent?.getByteExtra(Intent.EXTRA_STREAM, 0)} \n" +
                " flags: ${intent?.flags}")
        val d1 = intent?.getStringExtra(Intent.EXTRA_TEXT)


        val t = intent?.action
        return super.onBind(intent)
    }

    override fun onGetChooserTargets(p0: ComponentName?, p1: IntentFilter?): MutableList<ChooserTarget> {

        Log.e("---", "STARTINMG ${p1?.getDataType(0)}  ")
//        ${p1?.getDataAuthority(0)
        Log.e("---", "dataType: ${p1?.countDataTypes()}\n" +
                "countActions: ${p1?.countActions()}\n" +
                "countCategories: ${p1?.countCategories()}\n" +
                "countDataAuthorities: ${p1?.countDataAuthorities()}\n" +
                "countDataPaths: ${p1?.countDataPaths()}\n" +
                "countDataSchemeSpecificParts: ${p1?.countDataSchemeSpecificParts()}\n" +
                "countDataSchemes: ${p1?.countDataSchemes()}\n"
        )


//        p1?.dump()
//        p1?.categoriesIterator()?.forEach {
//            Log.e("---", "ITERATOR $it")
//        }

        val targets = arrayListOf<ChooserTarget>()
//        val componentName = ComponentName(packageName, MainActivity::class.java.canonicalName)
//        repeat(1) {
//
////            targets.add(ChooserTarget("test", null, 1.0f, componentName, Bundle()))
//        }

        return targets
    }

}