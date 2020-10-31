import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        System.out.println("How many items?");
        Scanner ask = new Scanner(System.in);
        int items = ask.nextInt();

        System.out.println("How much time per item?");
        int time = ask.nextInt();

        if (time > 100){
            time = ((time/100) * 60) + time % 100;
        }
        
        time += (time/2)*(items - 1);

        System.out.println("Heat for " + time / 60 + " minutes and " + time % 60 + " seconds");

    }
}
