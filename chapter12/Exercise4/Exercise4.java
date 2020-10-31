import java.util.Scanner;
public class Exercise4 {
   public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("What is v");
        int v = ask.nextInt();
        System.out.println("What is r");
        int r = ask.nextInt();
        System.out.println((v+0.0)/r);

   } 
}
