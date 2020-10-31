import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("How many years?");
        int years = ask.nextInt();
        System.out.println("How many months?");
        int months = ask.nextInt();
        System.out.println("How many days?");
        int days = ask.nextInt();

        System.out.println("You have been alive for " + (31536000 * years + 2628002 * months + 86400 *days) + " seconds");
    }
}
