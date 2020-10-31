import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("Enter a double:");

        double dbl = ask.nextDouble();

        System.out.println("Base 2 of " + dbl + " is "+ Math.log(dbl));
    }
}
