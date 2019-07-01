package com.mikelangdon.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{
    // this is where the app starts
    public static void main(String[] args)
    {
        Question[] questions = new Question[6];
        String[] mcAns0 = {"A. First place", "B. Second place", "C. Third place"};
        String[] mcAns1 = {"A. up, up, down", "B. down, down, up", "C. left, left, right"};
        String[] mcAns2 = {"A. True", "B. False", "C. It's a trap!  This is a multiple choice question."};

        String[][] mcAnswer = {mcAns0, mcAns1, mcAns2};

        questions[0] = new TrueFalseQuestion("Laney is better than BCC?", true);
        questions[1] = new TrueFalseQuestion("Java is an easy to understand language?", false);
        questions[2] = new FillTheBlankQuestion("Which season will the F building be open?", "fall", "Fall 2019", "Maybe never");
        questions[3] = new MultipleChoiceQuestion("If you are running a race and you pass the person in 2nd place, what place are you in?", mcAns0, 1);
        questions[4] = new MultipleChoiceQuestion("In terms of its quark constituents, a proton is: ", mcAns1, 0);
        questions[5] = new MultipleChoiceQuestion("This is a True/False question.", mcAns2, 2);

        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!\n");

        while (index < questions.length)
        {
            System.out.println(questions[index].getText());

            if (questions[index].isMultipleChoiceQuestion()) {

                System.out.println("Enter A, B, or C to select the answer to the question: ");
                // Multiple choice questions begin at questions[3]:
                int i = index - 3;
                for (int j = 0; j < mcAnswer[i].length; j++) {
                    System.out.println(mcAnswer[i][j] + "\n");
                }

            }

            if (questions[index].readInputAndCheckAnswer(input))
            {
                System.out.println("You are correct!\n");
            }
            else
            {
                System.out.println("You are incorrect!\n");
            }

            index++;
        }
    }
}
