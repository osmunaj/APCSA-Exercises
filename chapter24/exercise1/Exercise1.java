
public class Exercise1 {
    public static void main(String[] args){
        

        for (double t = 0; t < 25; t++){
            double n = 220/(1+ 10 * (Math.pow(0.83, t)));
            System.out.println(n);
        }

    }
}
