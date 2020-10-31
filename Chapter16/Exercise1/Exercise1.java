import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Price of purchace");
        int price = ask.nextInt();
        if (price > 1000){
            price *= 0.9;
        }
        System.out.println("Final Price: " + price);
        
    }
}
