package com.example.dicoding.retorfittesting.repository

interface RepositoryCallback<T> {

    fun onDataLoaded(data: T?)
    fun onDataError()
}