//James Avila
//CS1400
//Assignment 4
//11-05-21
import java.util.Scanner;
public class TriviaGame {
    public static void main(String[] args){
      
        //Initializing variables and Question objects
        Scanner keyboard = new Scanner(System.in);
        int player1Score = 0;
        int player2Score = 0;
        Question[] questions =  new Question[10]; 
        questions[0] = new Question("What is the tallest mountain in the world?", "Mount Whitney",  
        "Mount Everest", "Mount Kilimanjaro", "Aconcagua", 2);
        questions[1] = new Question("Which of these is not a primary color?", "Red", "Yellow", "Green", "Blue", 3);
        questions[2] = new Question("In what year did World War 1 begin?", "1920", "1939", "1918", "1914", 4);
        questions[3] = new Question("Which country is most associated with the Khmer ethnic group?", "India", "Cambodia",
        "China", "Mongolia", 2);
        questions[4] = new Question("How many months have 28 days?", "Twelve", "One", "Six", "Seven", 1);
        questions[5] = new Question("How often do leap years occur?", "Every 2 years", "Every 4 years",
        "Every 10 years", "Every 5 years", 2);
        questions[6] = new Question("In what year did humans first land on the moon?" , "1970", "1956", "1947", "1969", 4);
        questions[7] = new Question("Which is not an official language of Switzerland?", "English", "German", "French",
        "Italian", 1);
        questions[8] = new Question("What temperature is considered room temperature?", "20°C", "32°C", "0°C,", "50°C", 1);
        questions[9] = new Question("Which is not a shape associated with the show Squid Games?", "Square", 
        "Circle", "Star", "Triangle", 3);

        //Instruction sequence
        System.out.println("Welcome to the trivia game. This game requires 2 players. Each player will have to answer" + 
        " 5 questions. If you answer a question correctly you will recieve 1 point. Once both players have attempted" + 
        " 5 questions each, a winner will be determined at the end. When you are ready, type the number 1 and press enter.");

        //Waiting to play sequence
        int isReady = keyboard.nextInt();
        while(isReady != 1){
            System.out.println("Type the number 1 and press enter to begin.");
            isReady = keyboard.nextInt();
        }
        isReady = 0;

        //Player 1 sequence
        System.out.println("\nPlayer 1 will begin, here is the first question.");
        for(int i = 0; i < questions.length/2; i++){
            System.out.println(questions[i].getQuestion());
            System.out.println("1: " + questions[i].getAnswer1() + " 2: " + questions[i].getAnswer2() +"\n" + 
            "3: " + questions[i].getAnswer3() + " 4: " + questions[i].getAnswer4());
            System.out.println("Type and enter the number that corresponds to your answer.");
            int choice = keyboard.nextInt();

            while(choice < 1 || choice > 4){
                System.out.println("Please type and enter a number from 1-4.");
                choice = keyboard.nextInt();
            }
            if(choice == questions[i].getCorrectAnswer()){
                player1Score++;
                System.out.println("That was correct!");
            }else{
                System.out.println("That was incorrect");
            }
            if( i != questions.length/2 - 1){
                System.out.println("Here is the next question.\n");
            }else{
                System.out.println("Player 1's turn has ended.\n");
            }
           
        }
        
        /*
        //Player 2 sequence
        System.out.println("Now it is player 2's turn.");
        while(isReady != 1){
            System.out.println("Type the number 1 and press enter to begin.");
            isReady = keyboard.nextInt();
        }
        for(int i = 5; i < questions.length; i++){
            System.out.println(questions[i].getQuestion());
            System.out.println("1: " + questions[i].getAnswer1() + " 2: " + questions[i].getAnswer2() +"\n" + 
            "3: " + questions[i].getAnswer3() + " 4: " + questions[i].getAnswer4());
            System.out.println("Type and enter the number that corresponds to your answer.");
            int choice = keyboard.nextInt();

            while(choice < 1 || choice > 4){
                System.out.println("Please type and enter a number from 1-4.");
                choice = keyboard.nextInt();
            }
            if(choice == questions[i].getCorrectAnswer()){
                player2Score++;
                System.out.println("That was correct!");
            }else{
                System.out.println("That was incorrect");
            }
            if( i != questions.length - 1){
                System.out.println("Here is the next question.\n");
            }else{
                System.out.println("Player 2's turn has ended.\n");
            }
           
        }
       
        */
        //End game sequence
        System.out.println("Here are the results\n" + "Player 1 score: " + player1Score + "\nPLayer 2 score: " + 
        player2Score);
        if(player1Score > player2Score){
            System.out.println("Player 1 wins!");
        }else if(player1Score < player2Score){
            System.out.println("Player 2 wins!");
        }else{
            System.out.println("Both player tied!");
        }
        keyboard.close();
    }
}
