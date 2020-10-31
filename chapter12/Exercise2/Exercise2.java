import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Imput the cents");
        int cents = ask.nextInt();
        System.out.println("This is " + cents/100 + " dollars and " + cents % 100 + " cents.");
    }   
}
