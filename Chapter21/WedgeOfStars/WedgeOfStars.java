import java.util.Scanner;
public class WedgeOfStars{
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("innitial Number of Stars?");
        
        int stars = ask.nextInt();

        int count = 0;
        int count2 = stars;

        while (count < count2){
            for (int i = 0; i < stars; i ++){
                System.out.print("*");
            }
            System.out.println();

            stars -= 1;
            count += 1;
        }

        
    }
}