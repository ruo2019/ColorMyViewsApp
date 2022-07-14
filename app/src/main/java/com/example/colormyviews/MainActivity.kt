package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import java.util.*

const val BOX_ONE = "box_one_key"
const val BOX_TWO = "box_two_key"
const val BOX_THREE = "box_three_key"
const val BOX_FOUR = "box_four_key"
const val BOX_FIVE = "box_five_key"
const val BOX_SIX = "box_six_key"
const val BOX_SEVEN = "box_seven_key"
const val BOX_EIGHT = "box_eight_key"
const val BOX_NINE = "box_nine_key"
const val BOX_TEN = "box_ten_key"
const val BOX_ELEVEN = "box_eleven_key"
const val BOX_TWELVE = "box_twelve_key"
const val BOX_THIRTEEN = "box_thirteen_key"
const val BOX_FOURTEEN = "box_fourteen_key"
const val BOX_FIFTEEN = "box_fifteen_key"
const val BOX_SIXTEEN = "box_sixteen_key"
const val BOX_SEVENTEEN = "box_seventeen_key"
const val BOX_EIGHTEEN = "box_eighteen_key"
const val BOX_NINETEEN = "box_nineteen_key"
const val BOX_TWENTY = "box_twenty_key"
const val BOX_TWENTY_ONE = "box_twenty_one_key"
const val BOX_TWENTY_TWO = "box_twenty_two_key"
const val BOX_TWENTY_THREE = "box_twenty_three_key"
const val BACKGROUND = "background_key"
class MainActivity : AppCompatActivity() {
    var box_one = Color.rgb(255, 255, 255)
    var box_two = Color.rgb(255, 255, 255)
    var box_three = Color.rgb(255, 255, 255)
    var box_four = Color.rgb(255, 255, 255)
    var box_five = Color.rgb(255, 255, 255)
    var box_six = Color.rgb(255, 255, 255)
    var box_seven = Color.rgb(255, 255, 255)
    var box_eight = Color.rgb(255, 255, 255)
    var box_nine = Color.rgb(255, 255, 255)
    var box_ten = Color.rgb(255, 255, 255)
    var box_eleven = Color.rgb(255, 255, 255)
    var box_twelve = Color.rgb(255, 255, 255)
    var box_thirteen = Color.rgb(255, 255, 255)
    var box_fourteen = Color.rgb(255, 255, 255)
    var box_fifteen = Color.rgb(255, 255, 255)
    var box_sixteen = Color.rgb(255, 255, 255)
    var box_seventeen = Color.rgb(255, 255, 255)
    var box_eighteen = Color.rgb(255, 255, 255)
    var box_nineteen = Color.rgb(255, 255, 255)
    var box_twenty = Color.rgb(255, 255, 255)
    var box_twenty_one = Color.rgb(255, 255, 255)
    var box_twenty_two = Color.rgb(255, 255, 255)
    var box_twenty_three = Color.rgb(255, 255, 255)
    var background = Color.rgb(255, 255, 255)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Color

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
            boxOneText,
            boxTwoText,
            boxThreeText,
            boxFourText,
            boxFiveText,
            boxSixText,
            boxSevenText,
            boxEightText,
            boxNineText,
            boxTenText,
            boxElevenText,
            boxTwelveText,
            boxThirteenText,
            boxFourteenText,
            boxFifteenText,
            boxSixteenText,
            boxSeventeenText,
            boxEighteenText,
            boxNineteenText,
            boxTwentyText,
            boxTwentyOneText,
            boxTwentyTwoText,
            boxTwentyThreeText,
            rootConstraintLayout
        )
        for (i in clickableViews) {
            i.setOnClickListener { makeColored(it) }
        }
        if (savedInstanceState!=null) {
            box_one = savedInstanceState.getInt(BOX_ONE)
            Log.i("MainActivity", box_one.toString())
            box_two = savedInstanceState.getInt(BOX_TWO)
            box_three = savedInstanceState.getInt(BOX_THREE)
            box_four = savedInstanceState.getInt(BOX_FOUR)
            box_five = savedInstanceState.getInt(BOX_FIVE)
            box_six = savedInstanceState.getInt(BOX_SIX)
            box_seven = savedInstanceState.getInt(BOX_SEVEN)
            box_eight = savedInstanceState.getInt(BOX_EIGHT)
            box_nine = savedInstanceState.getInt(BOX_NINE)
            box_ten = savedInstanceState.getInt(BOX_TEN)
            box_eleven = savedInstanceState.getInt(BOX_ELEVEN)
            box_twelve = savedInstanceState.getInt(BOX_TWELVE)
            box_thirteen = savedInstanceState.getInt(BOX_THIRTEEN)
            box_fourteen = savedInstanceState.getInt(BOX_FOURTEEN)
            box_fifteen = savedInstanceState.getInt(BOX_FIFTEEN)
            box_sixteen = savedInstanceState.getInt(BOX_SIXTEEN)
            box_seventeen = savedInstanceState.getInt(BOX_SEVENTEEN)
            box_eighteen = savedInstanceState.getInt(BOX_EIGHTEEN)
            box_nineteen = savedInstanceState.getInt(BOX_NINETEEN)
            box_twenty = savedInstanceState.getInt(BOX_TWENTY)
            box_twenty_one = savedInstanceState.getInt(BOX_TWENTY_ONE)
            box_twenty_two = savedInstanceState.getInt(BOX_TWENTY_TWO)
            box_twenty_three = savedInstanceState.getInt(BOX_TWENTY_THREE)
            background = savedInstanceState.getInt(BACKGROUND)
        }
        boxOneText.setBackgroundColor(box_one)
        boxTwoText.setBackgroundColor(box_two)
        boxThreeText.setBackgroundColor(box_three)
        boxFourText.setBackgroundColor(box_four)
        boxFiveText.setBackgroundColor(box_five)
        boxSixText.setBackgroundColor(box_six)
        boxSevenText.setBackgroundColor(box_seven)
        boxEightText.setBackgroundColor(box_eight)
        boxNineText.setBackgroundColor(box_nine)
        boxTenText.setBackgroundColor(box_ten)
        boxElevenText.setBackgroundColor(box_eleven)
        boxTwelveText.setBackgroundColor(box_twelve)
        boxThirteenText.setBackgroundColor(box_thirteen)
        boxFourteenText.setBackgroundColor(box_fourteen)
        boxFifteenText.setBackgroundColor(box_fifteen)
        boxSixteenText.setBackgroundColor(box_sixteen)
        boxSeventeenText.setBackgroundColor(box_seventeen)
        boxEighteenText.setBackgroundColor(box_eighteen)
        boxNineteenText.setBackgroundColor(box_nineteen)
        boxTwentyText.setBackgroundColor(box_twenty)
        boxTwentyOneText.setBackgroundColor(box_twenty_one)
        boxTwentyTwoText.setBackgroundColor(box_twenty_two)
        boxTwentyThreeText.setBackgroundColor(box_twenty_three)
        rootConstraintLayout.setBackgroundColor(background)

        // Images
//        images()
//        setListenersImages()
    }


    // COLORS!!

    private fun makeColored(view: View) {
        val random = Random()
        val color = Color.rgb(random.nextInt(1), 115 + random.nextInt(60), 255)
        view.setBackgroundColor(color)
        if (view.id==R.id.box_one_text) {
            box_one = color
        }
        if (view.id==R.id.box_two_text) {
            box_two = color
        }
        if (view.id==R.id.box_three_text) {
            box_three = color
        }
        if (view.id==R.id.box_four_text) {
            box_four = color
        }
        if (view.id==R.id.box_five_text) {
            box_five = color
        }
        if (view.id==R.id.box_six_text) {
            box_six = color
        }
        if (view.id==R.id.box_seven_text) {
            box_seven = color
        }
        if (view.id==R.id.box_eight_text) {
            box_eight = color
        }
        if (view.id==R.id.box_nine_text) {
            box_nine = color
        }
        if (view.id==R.id.box_ten_text) {
            box_ten = color
        }
        if (view.id==R.id.box_eleven_text) {
            box_eleven = color
        }
        if (view.id==R.id.box_twelve_text) {
            box_twelve = color
        }
        if (view.id==R.id.box_thirteen_text) {
            box_thirteen = color
        }
        if (view.id==R.id.box_fourteen_text) {
            box_fourteen = color
        }
        if (view.id==R.id.box_fifteen_text) {
            box_fifteen = color
        }
        if (view.id==R.id.box_sixteen_text) {
            box_sixteen = color
        }
        if (view.id==R.id.box_seventeen_text) {
            box_seventeen = color
        }
        if (view.id==R.id.box_eighteen_text) {
            box_eighteen = color
        }
        if (view.id==R.id.box_nineteen_text) {
            box_nineteen = color
        }
        if (view.id==R.id.box_twenty_text) {
            box_twenty = color
        }
        if (view.id==R.id.box_twenty_one_text) {
            box_twenty_one = color
        }
        if (view.id==R.id.box_twenty_two_text) {
            box_twenty_two = color
        }
        if (view.id==R.id.box_twenty_three_text) {
            box_twenty_three = color
        }
        if (view.id==R.id.constraint_layout) {
            background = color
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
        boxOneText.visibility = View.GONE
        boxTwoText.visibility = View.GONE
        boxThreeText.visibility = View.GONE
        boxFourText.visibility = View.GONE
        boxFiveText.visibility = View.GONE
        boxSixText.visibility = View.GONE
        boxSevenText.visibility = View.GONE
        boxEightText.visibility = View.GONE
        boxNineText.visibility = View.GONE
        boxTenText.visibility = View.GONE
        boxElevenText.visibility = View.GONE
        boxTwelveText.visibility = View.GONE
        boxThirteenText.visibility = View.GONE
        boxFourteenText.visibility = View.GONE
        boxFifteenText.visibility = View.GONE
        boxSixteenText.visibility = View.GONE
        boxSeventeenText.visibility = View.GONE
        boxEighteenText.visibility = View.GONE
        boxNineteenText.visibility = View.GONE
        boxTwentyText.visibility = View.GONE
        boxTwentyOneText.visibility = View.GONE
        boxTwentyTwoText.visibility = View.GONE
        boxTwentyThreeText.visibility = View.GONE
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


    // Save Colors!!

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(BOX_ONE, box_one)
        Log.i("MainActivity", box_one.toString())
        outState.putInt(BOX_TWO, box_two)
        outState.putInt(BOX_THREE, box_three)
        outState.putInt(BOX_FOUR, box_four)
        outState.putInt(BOX_FIVE, box_five)
        outState.putInt(BOX_SIX, box_six)
        outState.putInt(BOX_SEVEN, box_seven)
        outState.putInt(BOX_EIGHT, box_eight)
        outState.putInt(BOX_NINE, box_nine)
        outState.putInt(BOX_TEN, box_ten)
        outState.putInt(BOX_ELEVEN, box_eleven)
        outState.putInt(BOX_TWELVE, box_twelve)
        outState.putInt(BOX_THIRTEEN, box_thirteen)
        outState.putInt(BOX_FOURTEEN, box_fourteen)
        outState.putInt(BOX_FIFTEEN, box_fifteen)
        outState.putInt(BOX_SIXTEEN, box_sixteen)
        outState.putInt(BOX_SEVENTEEN, box_seventeen)
        outState.putInt(BOX_EIGHTEEN, box_eighteen)
        outState.putInt(BOX_NINETEEN, box_nineteen)
        outState.putInt(BOX_TWENTY, box_twenty)
        outState.putInt(BOX_TWENTY_ONE, box_twenty_one)
        outState.putInt(BOX_TWENTY_TWO, box_twenty_two)
        outState.putInt(BOX_TWENTY_THREE, box_twenty_three)
        outState.putInt(BACKGROUND, background)
    }
}