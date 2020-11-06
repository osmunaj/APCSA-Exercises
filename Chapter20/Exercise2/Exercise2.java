import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        System.out.println("Enter integer");
        Scanner ask = new Scanner(System.in);
        int i = ask.nextInt();

        int count = 1;
        double sum = 0.0;
        while(count <= i){
            sum += 1.0/count;
            count += 1;
        }

        System.out.println("Sum:"  + sum);
    }
}
