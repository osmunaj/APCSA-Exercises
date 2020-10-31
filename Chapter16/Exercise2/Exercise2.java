import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("How many bolts?");
        int bolts = ask.nextInt();
        System.out.println("How many nuts?");
        int nuts = ask.nextInt();
        System.out.println("How many washers?");
        int washers = ask.nextInt();

        System.out.println("Number of Bolts: " + bolts);
        System.out.println("Number of Nuts: " + nuts);
        System.out.println("Number of Washers: " + washers); 


        if (nuts < bolts){
            System.out.println("Not enough nuts");
        }
        if (2*washers < bolts){
            System.out.println("Not enough washers");
        }

        if (nuts >= bolts && 2*washers >= bolts){
            System.out.println("Order is ok!");
        }

        System.out.println("Order cost: " +  (0.05 * bolts + 0.03 * nuts + 0.01 * washers));
    }
}
