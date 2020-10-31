import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter X");
        double x = ask.nextDouble();
        System.out.println("Enter Y");
        double y = ask.nextDouble();

        System.out.println("Arithmatic Mean: " + (x+y)/2);
        System.out.println("Harmonic Mean: " + 2/(1/x + 1/y));

    }
}
