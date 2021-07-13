package com.mtugrulkaan.locationapps

import android.app.Application
import com.parse.Parse

class StarterApplication: Application() {

    override fun onCreate() {
        super.onCreate()

       Parse.initialize(Parse.Configuration.Builder(this)
           .applicationId("1XldcLP5tE02gG5cQDL3lFgCgWJYvltAeuSolTax")
           .clientKey("hICWGYvd6KPWLOC39UxabHNdOEw3zvxuXH5MpD0H")
           .server("https://parseapi.back4app.com/")
           .build()

       )
    }
}