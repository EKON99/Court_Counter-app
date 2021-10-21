package com.example.android.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.TextView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var aTotalScore = 0
    var bTotalScore = 0

    fun scoreReset(view: View){
        aTotalScore = 0
         displayForTeamA(aTotalScore)
        bTotalScore = 0
         displayForTeamB(bTotalScore)
    }

    fun aThreePointer(view: View) {
        aTotalScore = aTotalScore + 3
        displayForTeamA(aTotalScore)
    }

    fun aTwoPointer(view: View) {
        aTotalScore = aTotalScore + 2
        displayForTeamA(aTotalScore)
    }

    fun aFreeThrow(view: View) {
        aTotalScore = aTotalScore + 1
        displayForTeamA(aTotalScore)
    }

    /*fun scoreReset(view: View){
        totalScore = 0
        displayForTeamA(totalScore)
    }*/

    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<View>(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    fun bThreePointer(view: View) {
        bTotalScore = bTotalScore + 3
        displayForTeamB(bTotalScore)
    }

    fun bTwoPointer(view: View) {
        bTotalScore = bTotalScore + 2
        displayForTeamB(bTotalScore)
    }

    fun bFreeThrow(view: View) {
        bTotalScore = bTotalScore + 1
        displayForTeamB(bTotalScore)
    }

    /*fun scoreReset(view: View){
        totalScore = 0
        displayForTeamA(totalScore)
    }*/

    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<View>(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }
}