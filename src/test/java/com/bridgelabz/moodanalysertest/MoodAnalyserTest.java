package com.bridgelabz.moodanalysertest;

import com.bridegelabz.moodanalyser.MoodAnalyser;
import com.bridegelabz.moodanalyser.MoodAnalyserException;
import org.junit.Test;
import org.junit.Assert;

/**
 * Moode analyser program test case
 *
 * @author : Snehal Patil
 */
public class MoodAnalyserTest {
    // -----------------Test for Sad-----------
    @Test
    public void givenMessageWhenSadShouldBeReturnSad() {
        // create object and set message
        MoodAnalyser moodeAnalyser = new MoodAnalyser("I am in Sad mood");
        String expectedValue = "SAD";
        String mood;
        try {
            mood = moodeAnalyser.analyseMood();
            Assert.assertEquals(expectedValue, mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }

    // ---------------Test for Happy---------------
    @Test
    public void givenMessageWhenHappyShouldBeReturnHappy() {
        // create object and ser message
        MoodAnalyser moodeAnalyser = new MoodAnalyser("I am Happy");
        String expectedValue = "HAPPY";
        String mood;
        try {
            mood = moodeAnalyser.analyseMood();
            Assert.assertEquals(expectedValue, mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
}