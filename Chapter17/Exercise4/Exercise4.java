import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Welcome to Yertle's Quest");
        System.out.println("Enter the name of your character:");
        String name = ask.next();
        

        System.out.println("Enter the Strength (1-10)");
        int strength = ask.nextInt();
        if(strength > 10){
            strength = 5;
        }
        System.out.println("Enter the health (1-10)");
        int health = ask.nextInt();
        if (health > 10){
            health = 5;
        }
        System.out.println("Enter the luck (1-10)");
        int luck = ask.nextInt();
        if (luck > 10){
            luck = 5;
        }

        if (health + luck + strength > 15){
            System.out.println("Total is greater than 15, default valuses have been assigned");
            health = 5;
            luck = 5;
            strength = 5;
        }
        

    }
}
