import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){

        int month = 0;
        double effectiveness = 100.0;
        double initEff = effectiveness;
        while (effectiveness > initEff / 2){
            System.out.println("Month: " + month);
            System.out.println("Effectiveness: " + effectiveness);
            effectiveness *= 0.96;
            month += 1;
        }
        System.out.println("It takes " + month + " months to expire");
    }
}
