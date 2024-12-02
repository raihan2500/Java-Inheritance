package E95;

public class NumericQuestion extends Question {
    private double answer;

    public NumericQuestion() {
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(double response) {
        return Math.abs(answer - response) <= 0.01;
    }
}
