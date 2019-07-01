package com.mikelangdon.checkpoint3;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {

    // Options for A, B, C, etc.
    private String[] mOptions;

    // the index in mOptions
    private int mAnswer;

    public MultipleChoiceQuestion(String text, String[] options, int answer) {
        super(text);
        mOptions = options;
        mAnswer = answer;
    }

    // Checks whether ans equals mAnswer.
    @Override
    public boolean checkAnswer(int answer) {

        for (String ans : mOptions) {
            if (answer == mAnswer) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isMultipleChoiceQuestion() {
        return true;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input) {
        int intInput = 3;  // I know, it's ugly, but it sets checkAnswer as false if user enters anything other than the 3 options.


        char in = input.next().charAt(0);
        switch (in) {
            case 'A':
            case 'a':
                intInput = 0;
                break;
            case 'B':
            case 'b':
                intInput = 1;
                break;
            case 'C':
            case 'c':
                intInput = 2;
                break;
        }
        return checkAnswer(intInput);

    }
}
