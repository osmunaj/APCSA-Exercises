import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter cost per kilowatt-hour  in cents");

        
        
        double costPer = ask.nextDouble();

        System.out.println("Enter kilowatt-hours used per year");
        
        int time = ask.nextInt();
        
        System.out.println("Anual Cost: " + (costPer * time) / 100.0);
    }
}
