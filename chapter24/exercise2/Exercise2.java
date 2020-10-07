import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Int?");
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 1; i < n; i++){
            total += i;

        }
        System.out.println(total);
        System.out.println(Math.pow(n, 2));
    }
}
