package com.example.dicoding.retorfittesting.match

import com.example.dicoding.retorfittesting.entity.MatchResponse
import com.example.dicoding.retorfittesting.repository.RepositoryCallback

interface MatchView : RepositoryCallback<MatchResponse> {
    fun onShowLoading()
    fun onHideLoading()
}