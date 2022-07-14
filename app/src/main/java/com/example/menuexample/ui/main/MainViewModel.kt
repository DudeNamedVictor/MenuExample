package com.example.menuexample.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.menuexample.data.MainPageItem


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val _mainDataMLD = MutableLiveData<List<MainPageItem>>()
    val mainDataMLD: LiveData<List<MainPageItem>> = _mainDataMLD

    init {
        _mainDataMLD.value = MainUseCase().getData()
    }

}