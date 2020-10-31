import java.util.Random;
import java.util.Scanner;

public class SnakeEyes{
    public static void main(String[] args){
        double totalScore = 0;
        double gamesPlayed = 0;
        
        double numberOfRoles = 0;
        double totalNumberOfRoles = 0;
        int moreThanFourRoles = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds?");
        int totalGamesPlayed = scanner.nextInt();

        while (gamesPlayed < totalGamesPlayed){
            int dice1 = 0;
            int dice2 = 0;
            int score = 0;
            Random dice = new Random();
            numberOfRoles = 0;
            score = 0;
            while (!(dice1 == 1 && dice2 == 1)){
                
                dice1 = dice.nextInt(5) + 1;
                dice2 = dice.nextInt(5) + 1;
                System.out.println(dice1);
                System.out.println(dice2);
                score += dice1 + dice2;
                numberOfRoles += 1.0;
                if (numberOfRoles > 4) {
                    moreThanFourRoles += 1;
                }
            }
            
            totalScore += score;
            totalNumberOfRoles += numberOfRoles;
            gamesPlayed += 1;
        }
        double percentOfMoreThanFour = (moreThanFourRoles / totalGamesPlayed);
        double averageNumberOfRoles = totalNumberOfRoles / totalGamesPlayed;
        double averageScore = totalScore / totalGamesPlayed;

        
        System.out.println("The average number of roles was " + averageNumberOfRoles);
        System.out.println("The average score was " + averageScore);
        System.out.println("The percent of players that had more than 4 roles was " + percentOfMoreThanFour + "%");
    }
}