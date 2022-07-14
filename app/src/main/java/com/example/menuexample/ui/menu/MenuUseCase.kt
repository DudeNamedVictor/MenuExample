package com.example.menuexample.ui.menu

import com.example.menuexample.data.MenuPageItem

class MenuUseCase {

    fun getData(id: Int): List<MenuPageItem> {
        return when (id) {
            0 -> testList1()
            1 -> testList2()
            else -> testList3()
        }
    }

    private fun testList1(): List<MenuPageItem> {
        return listOf(MenuPageItem(
            "", "Бургер1", "Лучшие бургеры"),
            MenuPageItem(
                "", "Бургер2", "Плохая идея"),
            MenuPageItem(
                "", "Бургер3", "Лучше коктейли"),
            MenuPageItem(
                "", "Бургер4", "Плохая идея"),
            MenuPageItem(
                "", "Бургер5", "Лучше коктейли"),
            MenuPageItem(
                "", "Бургер6", "Плохая идея"),
            MenuPageItem(
                "", "Бургер7", "Лучше коктейли"),
            MenuPageItem(
                "", "Бургер8", "Плохая идея"),
            MenuPageItem(
                "", "Бургер9", "Лучше коктейли"),
            MenuPageItem(
                "", "Бургер10", "Плохая идея"),
            MenuPageItem(
                "", "Бургер11", "Лучше коктейли")
        )
    }

    private fun testList2(): List<MenuPageItem> {
        return listOf(MenuPageItem(
            "", "Суп1", "Лучшие бургеры"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли"),
            MenuPageItem(
                "", "Суп2", "Плохая идея"),
            MenuPageItem(
                "", "Суп3", "Лучше коктейли")
        )
    }

    private fun testList3(): List<MenuPageItem> {
        return listOf(MenuPageItem(
            "", "Пиво", "Лучшие бургеры"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли"),
            MenuPageItem(
                "", "Вода", "Плохая идея"),
            MenuPageItem(
                "", "Вино", "Лучше коктейли")
        )
    }

}