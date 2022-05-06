package com.bridegelabz.moodanalyser;

public class MoodAnalyser {
    // Variable Declaration
    static String message;

    // Default Constructor
    public MoodAnalyser() {
        message = null;
    }

    // Parameterised Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Setter
    public static void setMessage(String message) {
        MoodAnalyser.message = message;
    }

    // Check mood wheather Happy or Sad
    public String analyseMood(String message) {
        
        try {
            if (message.equalsIgnoreCase("I am in sad mood"))
                return "SAD";
            else
                return "HAPPY";

        } catch (NullPointerException exception) {
            return "Happy";
        }
    }


}
