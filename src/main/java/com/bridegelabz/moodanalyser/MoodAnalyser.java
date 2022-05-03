package com.bridegelabz.moodanalyser;

public class MoodAnalyser {
    static String message;

    public  String analyseMood(String message) {
        if (message.equalsIgnoreCase("I am in sad mood"))
            return "SAD";
        else if (message.equalsIgnoreCase("I am in happy mood"))
            return "HAPPY";
        else
            return "No Match";
    }
}
