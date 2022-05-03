package com.bridegelabz.moodanalyser;

/**
 * Moode analyser program
 *
 * @author : Snehal Patil
 */

public class MoodAnalyserMain {
    public static void main(String[] args) {
        System.out.println("-------- Welcome To Mood Analyser Program --------");

        // Create object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // Pass Happy message
        System.out.println(moodAnalyser.analyseMood("I am in happy Mood"));

        // Pass Sad message
        System.out.println(moodAnalyser.analyseMood("I am in Sad Mood"));
    }
}
