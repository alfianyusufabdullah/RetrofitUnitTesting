package com.example.dicoding.retorfittesting.match

import com.example.dicoding.retorfittesting.entity.MatchResponse
import com.example.dicoding.retorfittesting.repository.MatchDataSource
import com.example.dicoding.retorfittesting.repository.MatchRepository

class MatchPresenter(private val view: MatchContract.View, private val matchRepository: MatchRepository) : MatchContract.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun getMatch(id: String) {

        view.onShowLoading()

        matchRepository.getMatch(id, object : MatchDataSource.LoadDataCallback {
            override fun onDataLoaded(response: MatchResponse?) {
                view.onDataLoaded(response)
            }

            override fun onDataError() {
                view.onDataError()
            }
        })

        view.onHideLoading()
    }

    override fun start() {
        getMatch("")
    }
}