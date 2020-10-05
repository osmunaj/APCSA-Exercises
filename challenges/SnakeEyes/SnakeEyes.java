import java.util.Random;


public class SnakeEyes{
    public static void main(String[] args){
        Random dice = new Random();
        int dice1 = 0;
        int dice2 = 0;
        int totalScore = 0;
        int totalTotalScore = 0;
        int gamesPlayed = 0;
        int totalGamesPlayed = 10;
        int numberOfRoles = 0;
        int totalNumberOfRoles = 0;
        int moreThanFourRoles = 0;
       
        boolean snakeyes = false;
        while (gamesPlayed < totalGamesPlayed){
            snakeyes = false;
            while (!snakeyes){

                if (dice1 == 1 && dice2 == 1){
                    snakeyes = true;
                }
                dice1 = dice.nextInt(6);
                dice2 = dice.nextInt(6);
                System.out.println(dice1);
                System.out.println(dice2);
                totalScore += dice1 + dice2;
                numberOfRoles += 1;
                System.out.println(numberOfRoles);
                if (numberOfRoles > 4) {
                    moreThanFourRoles += 1;
                }
            }
            totalTotalScore += totalScore;
            totalNumberOfRoles += numberOfRoles;
            gamesPlayed += 1;
        }
        double percentOfMoreThanFour = (moreThanFourRoles / totalGamesPlayed);
        double averageNumberOfRoles = totalNumberOfRoles / totalGamesPlayed;
        double averageScore = totalTotalScore / totalGamesPlayed;

        System.out.println(moreThanFourRoles);
        System.out.println("The average number of roles was " + averageNumberOfRoles);
        System.out.println("The average score was " + averageScore);
        System.out.println("The percent of players that had more than 4 roles was " + percentOfMoreThanFour + "%");
    }
}