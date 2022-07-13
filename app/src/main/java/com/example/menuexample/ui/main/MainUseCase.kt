package com.example.menuexample.ui.main

import com.example.menuexample.data.MainPageItem


class MainUseCase {

    fun provide(): List<MainPageItem> {
        return testList()
    }

    private fun testList(): List<MainPageItem> {
        return listOf(MainPageItem(
            "", "Бургеры", "Лучшие бургеры"),
            MainPageItem(
                "", "Супы", "Плохая идея"),
            MainPageItem(
                "", "Вина", "Лучше коктейли"),
            MainPageItem(
                "", "Супы", "Плохая идея"),
            MainPageItem(
                "", "Вина", "Лучше коктейли"),
            MainPageItem(
                "", "Супы", "Плохая идея"),
            MainPageItem(
                "", "Вина", "Лучше коктейли")
        )
    }

}