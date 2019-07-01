package com.mikelangdon.checkpoint3;

import java.util.Scanner;

public class FillTheBlankQuestion extends Question {
    private String[] mFillAnswers;

    public FillTheBlankQuestion(String text, String... ans)
    {
        super(text);
        mFillAnswers = ans;
    }

    // fill the blank question check
    @Override
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans : getFillAnswers())
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
                return true;
            }
        }

        return false;
    }

    public String[] getFillAnswers()
    {
        return mFillAnswers;
    }

    @Override
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        System.out.println("Enter answer: ");
        String in = input.nextLine();
        return checkAnswer(in);
}}
