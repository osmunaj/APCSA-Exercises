import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Imput the radius");
        int radius = ask.nextInt();
        System.out.println("The radius is " + radius + " and the area is " + (Math.PI * (radius * radius)));
    }
}
