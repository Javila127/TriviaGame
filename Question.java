//James Avila
//CS1400
//Assignment 4
//11-05-21
public class Question {
    String question;
    String answer1, answer2, answer3, answer4;
    int correctAnswer;
    
    public  Question(String q, String a1, String a2, String a3, String a4, int answer){
         question = q;
         answer1 = a1;
         answer2 = a2;
         answer3 = a3;
         answer4 = a4;
         correctAnswer = answer;
    }
    
    
    public String getQuestion(){
        return question;
    }

    public void setQuestion(String q){
        question = q;
    }

    public String getAnswer1(){
        return answer1;
    }

    public void setAnswer1(String a){
        answer1 = a;
    }

    public String getAnswer2(){
        return answer2;
    }

    public void setAnswer2(String a){
        answer2 = a;
    }

    public String getAnswer3(){
        return answer3;
    }

    public void setAnswer3(String a){
        answer3 = a;
    }

    public String getAnswer4(){
        return answer4;
    }

    public void setAnswer4(String a){
        answer4 = a;
    }

    public int getCorrectAnswer(){
        return correctAnswer;
    }

    public void setCorrectAnswer(int a){
        correctAnswer = a;
    }
}
