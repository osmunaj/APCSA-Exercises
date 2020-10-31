import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        int weight = ask.nextInt();
        if( weight > 220 && weight < 280){
            System.out.println("Can join");
        }else{
            System.out.println("Cannot join")
        }
    }
}
