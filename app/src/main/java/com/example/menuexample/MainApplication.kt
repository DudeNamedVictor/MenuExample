package com.example.menuexample

import android.app.Application
import android.content.Context
import com.example.menuexample.di.AppComponent
import com.example.menuexample.di.DaggerAppComponent

class MainApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

}