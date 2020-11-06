import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("How many numbers?");
        int amountOfInts = ask.nextInt();

        int count = 0;

        double averageSum = 0;
        double averageSquareSum = 0;
        while (count < amountOfInts){
            System.out.println("Number " + (count + 1));
            int number = ask.nextInt();
            averageSum += number;
            averageSquareSum += number * number;

            count +=1;
        }

        System.out.println("The standard deviation of N numbers is " + Math.sqrt((averageSquareSum / 4.0) - ((averageSum / 4.0)*(averageSum / 4.0))));
    }
}
