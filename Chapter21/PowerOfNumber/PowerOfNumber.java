import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is X?");
        double x = ask.nextDouble();
        System.out.println("What is N?");
        int n = ask.nextInt();
        double sum = 1;

        for (int i = 0; i < n; i++){
            sum *= x;
        }
        System.out.println(x + " to the power of " + n + " equals " + sum);
    }
}
