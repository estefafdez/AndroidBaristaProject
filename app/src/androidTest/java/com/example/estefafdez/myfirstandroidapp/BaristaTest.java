package com.example.estefafdez.myfirstandroidapp;
import android.util.Log;

import com.schibsted.spain.barista.BaristaAssertions;
import com.schibsted.spain.barista.BaristaClickActions;
import com.schibsted.spain.barista.BaristaEditTextActions;
import com.schibsted.spain.barista.BaristaNavigationDrawerActions;
import com.schibsted.spain.barista.BaristaRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


/**
 * Created by estefafdez
 * Test Class using Barista.
 */

public class BaristaTest {

    @Rule
    public BaristaRule<MainActivity> baristaRule = BaristaRule.create(MainActivity.class);
    TestName name = new TestName();

    @Before
    public void setUp(){
        Log.i("Info","[START] - Launch Test: " + name.getMethodName());
        baristaRule.launchActivity();
    }

    @After
    public void tearDown(){
        Log.i("Info", "[FINISH] - Test: " + name.getMethodName());
    }


    @Test
    public void testTextoIsDisplayed(){
        BaristaAssertions.assertDisplayed(R.id.texto);
        Log.i("Info", "The element text is displayed.");
    }

    @Test
    public void testEditTextIsDisplayed(){
        BaristaAssertions.assertDisplayed(R.id.editText);
        Log.i("Info", "The element editText is displayed.");
    }

    @Test
    public void testButtonsAreDisplayed(){
        BaristaAssertions.assertDisplayed(R.id.button1);
        Log.i("Info", "The element button1 is displayed.");
        BaristaAssertions.assertDisplayed(R.id.button2);
        Log.i("Info", "The element button2 is displayed.");
    }

    @Test
    public void testClickOnButton1(){
        Log.i("Info", "Write a text on the edit text");
        BaristaEditTextActions.writeToEditText(R.id.editText, "This is my first Barista Test");
        Log.i("Info", "Click on the button1");
        BaristaClickActions.click(R.id.button1);
        Log.i("Info", "Check that the text is displayed on the text view");
        BaristaAssertions.assertDisplayed(R.string.textExample);
    }

    @Test
    public void checkSecondActivityImages(){
        Log.i("Info", "Click on the Click Here button");
        BaristaClickActions.click(R.id.buttonActivity);
        Log.i("Info", "Check the Android Img on the new activity");
        BaristaAssertions.assertDisplayed(R.id.android_img);
        Log.i("Info", "Check the Barista Img on the new activity");
        BaristaAssertions.assertDisplayed(R.id.barista_img);
        Log.i("Info", "Return to the Main Activity");
        BaristaClickActions.clickBack();
    }

    @Test
    public void checkSecondActivityTexts(){
        Log.i("Info", "Click on the Click Here button");
        BaristaClickActions.click(R.id.buttonActivity);
        Log.i("Info", "Check the Android text on the new activity");
        BaristaAssertions.assertDisplayed(R.id.androidText);
        Log.i("Info", "Check the Barista text on the new activity");
        BaristaAssertions.assertDisplayed(R.id.baristaText);
        Log.i("Info", "Return to the Main Activity");
        BaristaClickActions.clickBack();
    }
}
