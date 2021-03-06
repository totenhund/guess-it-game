package com.shpek.crocoup.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModel for the final screen showing the score
 */
class ScoreViewModel(finalScore: Int, wordCategory: String) : ViewModel() {

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private val _category = MutableLiveData<String>()
    val category: LiveData<String>
        get() = _category


    init {
        _score.value = finalScore
        _category.value = wordCategory
    }

    // play again flag
    fun onPlayAgain() {
        _eventPlayAgain.value = true
    }

    // play again complete flag
    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}