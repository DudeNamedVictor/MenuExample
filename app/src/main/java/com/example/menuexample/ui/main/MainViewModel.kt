package com.example.menuexample.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.menuexample.data.MainPageItem


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val _textMLD = MutableLiveData<List<MainPageItem>>()
    val text: LiveData<List<MainPageItem>> = _textMLD

    init {
        _textMLD.value = MainUseCase().provide()
    }

}