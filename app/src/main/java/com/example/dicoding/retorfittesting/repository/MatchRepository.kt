package com.example.dicoding.retorfittesting.repository

import com.example.dicoding.retorfittesting.entity.MatchResponse

class MatchRepository(private val dataSources: MatchRemoteDataSources) : MatchDataSource {

    override fun getMatch(id: String, callback: MatchDataSource.LoadDataCallback) {
        dataSources.getMatch(id, object : MatchDataSource.LoadDataCallback {
            override fun onDataLoaded(response: MatchResponse?) {
                callback.onDataLoaded(response)
            }

            override fun onDataError() {
                callback.onDataError()
            }
        })
    }
}