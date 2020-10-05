import java.util.Random;

public class SnakeEyes{
    public static void main(String[] args){
        Random dice = new Random();
        double dice1 = 0;
        double dice2 = 0;
        double totalScore = 0;
        double totalTotalScore = 0;
        double gamesPlayed = 0;
        double totalGamesPlayed = 100000;
        double numberOfRoles = 0;
        double totalNumberOfRoles = 0;
        int moreThanFourRoles = 0;
       
        boolean snakeyes = false;
        while (gamesPlayed < totalGamesPlayed){
            snakeyes = false;
            numberOfRoles = 0;
            totalScore = 0;
            while (!snakeyes){

                if (dice1 == 1 && dice2 == 1){
                    snakeyes = true;
                }
                dice1 = dice.nextInt(6);
                dice2 = dice.nextInt(6);
                totalScore += dice1 + dice2;
                numberOfRoles += 1.0;
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

        System.out.println("The number of roles more than 4 was " + moreThanFourRoles);
        System.out.println("The average number of roles was " + averageNumberOfRoles);
        System.out.println("The average score was " + averageScore);
        System.out.println("The percent of players that had more than 4 roles was " + percentOfMoreThanFour + "%");
    }
}