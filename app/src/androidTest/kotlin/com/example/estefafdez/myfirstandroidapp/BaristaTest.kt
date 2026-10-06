package com.example.estefafdez.myfirstandroidapp

import android.util.Log
import com.adevinta.android.barista.assertion.BaristaVisibilityAssertions
import com.adevinta.android.barista.interaction.BaristaClickInteractions
import com.adevinta.android.barista.interaction.BaristaEditTextInteractions
import com.adevinta.android.barista.rule.BaristaRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName

/**
 * Created by estefafdez
 */
class BaristaTest {

    @get:Rule
    val baristaRule: BaristaRule<MainActivity> = BaristaRule.create(MainActivity::class.java)

    @get:Rule
    val name = TestName()

    @Before
    fun setUp() {
        Log.i("Info","[START] - Launch Test: " + name.methodName)
        baristaRule.launchActivity()
    }
    
    @After
    fun tearDown() {
        Log.i("Info", "[FINISH] - Test: " + name.methodName)
    }


    @Test
    fun testTextoIsDisplayed() {
        BaristaVisibilityAssertions.assertDisplayed(R.id.texto)
        Log.i("Info", "The element text is displayed.")
    }

    @Test
    fun testEditTextIsDisplayed() {
        BaristaVisibilityAssertions.assertDisplayed(R.id.editText)
        Log.i("Info", "The element editText is displayed.")
    }

    @Test
    fun testButtonsAreDisplayed() {
        BaristaVisibilityAssertions.assertDisplayed(R.id.button1)
        Log.i("Info", "The element button1 is displayed.")
        BaristaVisibilityAssertions.assertDisplayed(R.id.button2)
        Log.i("Info", "The element button2 is displayed.")
    }

    @Test
    fun testClickOnButton1() {
        Log.i("Info", "Write a text on the edit text")
        BaristaEditTextInteractions.writeTo(R.id.editText, "This is my first Barista Test")
        Log.i("Info", "Click on the button1")
        BaristaClickInteractions.clickOn(R.id.button1)
        Log.i("Info", "Check that the text is displayed on the text view")
        BaristaVisibilityAssertions.assertDisplayed(R.string.textExample)
    }

    @Test
    fun checkSecondActivityImages() {
        Log.i("Info", "Click on the Click Here button")
        BaristaClickInteractions.clickOn(R.id.buttonActivity)
        Log.i("Info", "Check the Android Img on the new activity")
        BaristaVisibilityAssertions.assertDisplayed(R.id.android_img)
        Log.i("Info", "Check the Barista Img on the new activity")
        BaristaVisibilityAssertions.assertDisplayed(R.id.barista_img)
        Log.i("Info", "Return to the Main Activity")
        BaristaClickInteractions.clickBack()
    }

    @Test
    fun checkSecondActivityTexts() {
        Log.i("Info", "Click on the Click Here button")
        BaristaClickInteractions.clickOn(R.id.buttonActivity)
        Log.i("Info", "Check the Android text on the new activity")
        BaristaVisibilityAssertions.assertDisplayed(R.id.androidText)
        Log.i("Info", "Check the Barista text on the new activity")
        BaristaVisibilityAssertions.assertDisplayed(R.id.baristaText)
        Log.i("Info", "Return to the Main Activity")
        BaristaClickInteractions.clickBack()
    }
}
