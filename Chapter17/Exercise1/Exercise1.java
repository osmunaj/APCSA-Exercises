import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("Enter the Item: ");
        String item = ask.next();
        System.out.println("Enter the price: ");
        double price = ask.nextDouble();
        System.out.println("Overnight delivery?");
        boolean overnight = ask.nextBoolean();
        int total = 0;

        if(price < 10.00){
            total += 2.00;
        }
        if(overnight){
            total += 3.00;
        }

        System.out.println(item + ": " + price);
        System.out.println("Delivery: " + total);
        System.out.println("Total: " + (total + price));



        
    }
}
