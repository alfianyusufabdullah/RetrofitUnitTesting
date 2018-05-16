package com.example.dicoding.retrofittestingwithrx.match

import com.example.dicoding.retorfittesting.repository.MatchRepositoryCallback
import com.example.dicoding.retrofittestingwithrx.entity.MatchResponse

interface MatchView : MatchRepositoryCallback<MatchResponse> {
    fun onShowLoading()
    fun onHideLoading()
}