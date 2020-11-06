import java.util.Scanner;
import java.util.Random;
public class MultiplicationQuiz {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many Questions?");
        int numberOfQuestions = ask.nextInt();

        int questionsDone = 0;
        double correctAnswers = 0.0;

        while (questionsDone < numberOfQuestions){
            int number1 = 1 + random.nextInt(9);
            int number2 = 1 + random.nextInt(9);
            System.out.println("What is " + number1 + " X " + number2 + "?");
            if(ask.nextInt() == number1 *number2){
                System.out.println("Correct!");
                correctAnswers += 1.0;
            }else{
                System.out.println("False, the answer is " + (number1*number2) + ".");
            }
            questionsDone += 1;
        }

        System.out.println("Your score: " + correctAnswers + "/" + numberOfQuestions + " (" + ((correctAnswers/numberOfQuestions)*100) + "%).");
        

    }
}
