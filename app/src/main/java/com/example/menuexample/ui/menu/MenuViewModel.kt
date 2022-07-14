package com.example.menuexample.ui.menu

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.menuexample.data.MenuPageItem

class MenuViewModel(application: Application) : AndroidViewModel(application) {

    private val _menuDataMLD = MutableLiveData<List<MenuPageItem>>()
    val menuDataMLD: LiveData<List<MenuPageItem>> = _menuDataMLD

    fun setArguments(id: Int) {
        _menuDataMLD.value = MenuUseCase().getData(id)
    }



}