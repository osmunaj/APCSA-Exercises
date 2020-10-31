import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("How much change?");
        int change = ask.nextInt();
        System.out.println("Your change is " + change/100 + " dollars, " + (change%100 / 25) + " quarters, " + (change%100%25/10) + " dimes, and " + (change%100%25%10) + " cents.");
    }
}
