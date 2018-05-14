package com.example.dicoding.retorfittesting.repository

import com.example.dicoding.retorfittesting.entity.MatchResponse

interface MatchDataSource {

    fun getMatch(id: String, callback: LoadDataCallback)

    interface LoadDataCallback {
        fun onDataLoaded(response: MatchResponse?)
        fun onDataError()
    }
}