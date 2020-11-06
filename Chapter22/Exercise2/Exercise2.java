import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("Miles per Gallon Program");
        System.out.println("Innitial Miles:");
        int initialMiles = ask.nextInt();
        System.out.println("Final Miles:");
        int finalMiles = ask.nextInt();
        System.out.println("Gallons:");
        int gallons = ask.nextInt();
        System.out.println("Miles per gallon: " + ((finalMiles - initialMiles) / gallons));
    }
}
