package com.example.estefafdez.myfirstandroidapp;
import android.util.Log;

import com.schibsted.spain.barista.BaristaAssertions;
import com.schibsted.spain.barista.BaristaClickActions;
import com.schibsted.spain.barista.BaristaEditTextActions;
import com.schibsted.spain.barista.BaristaRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;


/**
 * Created by estefafdez on 11/8/17.
 */

public class BaristaTest {

    @Rule
    public BaristaRule<MainActivity> baristaRule = BaristaRule.create(MainActivity.class);
    public @Rule
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
        Log.i("Info", "The element texto is displayed.");
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

}
