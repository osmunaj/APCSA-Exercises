import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is N?");
        int n = ask.nextInt();

        while (n != 1){
            if(n % 2 == 0){
                System.out.println(n + " - N is even, next value is " + n + "/2");
                n /= 2;
               
            }else{
                System.out.println(n + " - N is odd, next value is " + n + "*3 + 1");
                n = n*3 + 1;
               
            }
        }
        System.out.println("N is 1, end calculation");
    }
}
