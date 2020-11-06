import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Low end of range");
        int lowRange = ask.nextInt();
        System.out.println("High end of range");
        int highRange = ask.nextInt();

        int data = 1;

        int sumOutRange = 0;
        int sumInRange = 0;
        while (data != 0){
            System.out.println("Enter Data");
            data = ask.nextInt();

            if(data >= lowRange && data <= highRange){
                sumInRange += data;
            }else{
                sumOutRange += data;
            }
        }

        System.out.println("Sum of in range numbers: " + sumInRange);
        System.out.println("Sum of out of range numbers: " + sumOutRange);
 

    }
}
