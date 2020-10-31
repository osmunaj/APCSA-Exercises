import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);

        System.out.println("Age?");
        int age = ask.nextInt();

        System.out.println("Time?");
        int time = ask.nextInt();
        boolean adult;
        boolean mantinee;

        if(time < 1700){
            mantinee = true;
        }else{
            mantinee = false;
        }
        if (age >= 13){
            adult = true;
        }else{
            adult = false;
        }



        int price;

        if(adult){
            if(mantinee){
                price = 5;
            }else{
                price = 8;
            }
        }else{
            if(mantinee){
                price = 2;
            }else{
                price = 4;
            }
        }
    }
}
