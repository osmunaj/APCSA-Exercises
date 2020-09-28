import java.util.concurrent.atomic.DoubleAccumulator;

public class Rainfall {
    public static void main(String[] args){
        double aprilRainfall = 12;
        double mayRainfall = 14;
        double juneRainfall = 8;

        double averageRainfall = (aprilRainfall + mayRainfall + juneRainfall) / 3;

        System.out.println(averageRainfall);
    }    
}
