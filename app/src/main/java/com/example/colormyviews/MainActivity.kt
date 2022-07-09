package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Colors
        setListeners()
        // Images
        images()
        setListenersImages()
    }


    // COLORS!!

    private fun makeColored(view: View) {
        val random = Random()
        val color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256))
        view.setBackgroundColor(color)
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTwelveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_sixteen_text)
        val boxSeventeenText = findViewById<TextView>(R.id.box_seventeen_text)
        val boxEighteenText = findViewById<TextView>(R.id.box_eighteen_text)
        val boxNineteenText = findViewById<TextView>(R.id.box_nineteen_text)
        val boxTwentyText = findViewById<TextView>(R.id.box_twenty_text)
        val boxTwentyOneText = findViewById<TextView>(R.id.box_twenty_one_text)
        val boxTwentyTwoText = findViewById<TextView>(R.id.box_twenty_two_text)
        val boxTwentyThreeText = findViewById<TextView>(R.id.box_twenty_three_text)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
//        var redButton = findViewById<Button>(R.id.red_button)
//        var yellowButton = findViewById<Button>(R.id.yellow_button)
//        var greenButton = findViewById<Button>(R.id.green_button)
//        val clickableViews = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout, redButton, yellowButton, greenButton)
        val clickableViews = listOf(
            boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, boxSixText,
            boxSevenText, boxEightText, boxNineText, boxTenText, boxElevenText, boxTwelveText,
            boxThirteenText, boxFourteenText, boxFifteenText, boxSixteenText, boxSeventeenText, boxEighteenText,
            boxNineteenText, boxTwentyText, boxTwentyOneText, boxTwentyTwoText, boxTwentyThreeText, rootConstraintLayout
        )
        for (i in clickableViews) {
            i.setOnClickListener { makeColored(it) }
        }
    }


    // IMAGES!!

    private fun makeBackground(view: View) {
        when (view.id) {
            R.id.box_one -> view.setBackgroundResource(R.drawable.image_one)
            R.id.box_two -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_three -> view.setBackgroundResource(R.drawable.image_three)
            R.id.box_four -> view.setBackgroundResource(R.drawable.image_four)
            R.id.box_five -> view.setBackgroundResource(R.drawable.image_five)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun images() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        boxOneText.visibility = View.GONE
        boxTwoText.visibility = View.GONE
        boxThreeText.visibility = View.GONE
        boxFourText.visibility = View.GONE
        boxFiveText.visibility = View.GONE
        val boxOne = findViewById<TextView>(R.id.box_one)
        val boxTwo = findViewById<TextView>(R.id.box_two)
        val boxThree = findViewById<TextView>(R.id.box_three)
        val boxFour = findViewById<TextView>(R.id.box_four)
        val boxFive = findViewById<TextView>(R.id.box_five)
        boxOne.visibility = View.VISIBLE
        boxTwo.visibility = View.VISIBLE
        boxThree.visibility = View.VISIBLE
        boxFour.visibility = View.VISIBLE
        boxFive.visibility = View.VISIBLE
    }

    private fun setListenersImages() {
        val boxOne = findViewById<TextView>(R.id.box_one)
        val boxTwo = findViewById<TextView>(R.id.box_two)
        val boxThree = findViewById<TextView>(R.id.box_three)
        val boxFour = findViewById<TextView>(R.id.box_four)
        val boxFive = findViewById<TextView>(R.id.box_five)
        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews =
            listOf(boxOne, boxTwo, boxThree, boxFour, boxFive, rootConstraintLayout)
        for (i in clickableViews) {
            i.setOnClickListener { makeBackground(it) }
        }
    }
}