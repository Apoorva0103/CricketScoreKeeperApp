package com.example.android.cricketscorekeeperapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.android.cricketscorekeeperapp.databinding.ActivityEnhancedBinding
import kotlinx.android.synthetic.main.activity_enhanced.*

class EnhancedActivity : AppCompatActivity() {

    private var indianScore = 0
    private var englandScore = 0
    private var indianWickets = 0
    private var englandWickets = 0

    companion object {
        const val SCORE_CHANGE_FOR_INDIA = 1
        const val SCORE_CHANGE_FOR_ENGLAND = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityEnhancedBinding>(this, R.layout.activity_enhanced)
        binding.main = this
    }

    fun incrementScore(score: Int, scoreFor: Int) {
        when (scoreFor) {
            SCORE_CHANGE_FOR_INDIA -> indianScore.plus(score)
            SCORE_CHANGE_FOR_ENGLAND -> englandScore.plus(score)
        }
        setScoreText()
    }

    fun incrementWickets(wicketFor: Int) {
        when {
            wicketFor == SCORE_CHANGE_FOR_INDIA && indianWickets < 10 -> indianWickets.inc()
            wicketFor == SCORE_CHANGE_FOR_ENGLAND && englandWickets < 10 -> englandWickets.inc()
        }
        setScoreText()
    }

    fun reset() {
        indianScore = 0
        indianWickets = 0
        englandScore = 0
        englandWickets = 0
        setScoreText()
    }

    private fun setScoreText() {
        team_1_score.text = "$indianScore/$indianWickets"
        team_2_score.text = "$englandScore/$englandWickets"

    }
}