package com.example.dicoding.retorfittesting.match

import com.example.dicoding.retorfittesting.BasePresenter
import com.example.dicoding.retorfittesting.BaseView
import com.example.dicoding.retorfittesting.entity.MatchResponse

class MatchContract {

    interface View : BaseView<Presenter>{
        fun onShowLoading()
        fun onDataLoaded(response: MatchResponse?)
        fun onDataError()
        fun onHideLoading()
    }

    interface Presenter : BasePresenter{
        fun getMatch(id: String)
    }
}