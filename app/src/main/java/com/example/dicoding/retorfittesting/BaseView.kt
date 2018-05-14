package com.example.dicoding.retorfittesting

interface BaseView<T> {
    fun setPresenter(presenter: T)
}