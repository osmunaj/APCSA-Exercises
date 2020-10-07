import java.util.Scanner;
public class Exercise3{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is n");
        int n = scanner.nextInt();
        int sumOfDivisors = 0;

        for (int i = 1; i < n; i++){
            if (n % i == 0){
                sumOfDivisors += i;
            }
        }
        System.out.println(sumOfDivisors);
    }
}
