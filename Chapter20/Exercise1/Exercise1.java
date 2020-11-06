import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("How many ints?");

        int numberOfInts = ask.nextInt();
        int total = 0;
        for (int i = 0; i < numberOfInts; i++){
            System.out.println("Enter an integer");
            total += ask.nextInt();
        }

        System.out.println("Total: " + total);

    }
}
