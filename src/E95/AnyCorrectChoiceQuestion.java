package E95;

import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends Question{
    public AnyCorrectChoiceQuestion() {
    }
    private String[] answerSet;

    @Override
    public void setAnswer(String answer) {
        answerSet = answer.split(" ");
        super.setAnswer(answer);
    }

    @Override
    public boolean checkAnswer(String response) {
        for(String answer : answerSet){
            if(answer.equals(response)){
                return  true;
            }
        }
        return false;
    }
}
