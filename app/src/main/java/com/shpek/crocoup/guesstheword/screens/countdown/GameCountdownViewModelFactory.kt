package com.shpek.crocoup.guesstheword.screens.countdown

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
/*
* * Factory for GameCountdownFragment
* */
class GameCountdownViewModelFactory(private val wordCategory: String) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameCountdownViewModel::class.java)) {
            return GameCountdownViewModel(wordCategory) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}