import java.util.Scanner;
public class SquaresAndCubes {
   public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Upper Limit?");
        int upperLimit = ask.nextInt();

        int count = 1;
        int sumOfSquares = 0;
        int sumOfCubes = 0;
        while (count <= upperLimit){
            sumOfSquares += (count)*(count);
            sumOfCubes += (count) * (count) * (count);
            count += 1;
        }
        System.out.println("Sum of squares: " + sumOfSquares);
        System.out.println("Sum of Cubes: " + sumOfCubes);
   } 
}
