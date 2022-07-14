package com.example.menuexample.utils

import android.content.Context
import com.example.menuexample.MainApplication
import com.example.menuexample.di.AppComponent


val Context.appComponent: AppComponent
    get() = when (this) {
        is MainApplication -> appComponent
        else -> this.applicationContext.appComponent
    }