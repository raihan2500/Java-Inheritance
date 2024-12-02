package E95;

import java.util.Scanner;

public class Runner {
    static Scanner in = new Scanner(System.in);
    static Scanner inSt = new Scanner(System.in);

    static void result(boolean flg){
        if(flg){
            System.out.println("Correct answer.");
        }else{
            System.out.println("Wrong answer.");
        }
    }

    public static void main(String[] args) {
        NumericQuestion numericQuestion = new NumericQuestion();
        numericQuestion.setText("What is the value of PI");
        numericQuestion.setAnswer(3.1416);
        result(numericQuestion.checkAnswer(in.nextDouble()));

        FillQuestion fillQuestion = new FillQuestion();
        fillQuestion.setText("The inventor of java was");
        fillQuestion.display();


        Question question = new Question();
        question.setAnswer("Raihan Ahmed");
        question.setText("What is your name?");

        result(question.checkAnswer(inSt.nextLine()));

        AnyCorrectChoiceQuestion ques = new AnyCorrectChoiceQuestion();
        ques.setText("What is your name?");
        ques.setAnswer("Raihan Ahmed Niloy");
        result(ques.checkAnswer(inSt.next()));
    }
}
