public class BirthdayParadox{
    public static void main(String[] args){
        
        for (int i = 0; i < 365; i++){
            double probability = Math.pow(((365 - i)/365), i);
            System.out.println(probability);
        }
    } 
}
