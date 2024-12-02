package E95;

public class Question {
    private String text;
    private String answer;

    public Question() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String withoutSpaceAndUpperCase(String string){
        string = string.replaceAll(" ", "");
        string = string.toLowerCase();
        return  string;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response){
        return withoutSpaceAndUpperCase(answer).equals(withoutSpaceAndUpperCase(response));
    }

    public void display(){
        System.out.println(text);
    }

}
