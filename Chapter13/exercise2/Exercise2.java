import java.util.Scanner;
public class Exercise2 {
    public static void main (String [] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        double seconds = ask.nextDouble();
        System.out.println("Distance: " + (1/2.0)*(32.174)*(seconds*seconds));   
    }
}
