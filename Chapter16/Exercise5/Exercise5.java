import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner ask = new Scanner(System.in);
        System.out.println("The price per pound of package A");
        double ppa = ask.nextDouble();
        System.out.println("The percent lean in package A");
        int pla = ask.nextInt();
        System.out.println("The price per pound of package B");
        double ppb = ask.nextDouble();
        System.out.println("The percent lean in package B");
        int plb = ask.nextInt();

        double costPoundA = (ppa / (pla / 100.0));
        double costPoundB = (ppb / (plb / 100.0));

        System.out.println("Package A cost per pound of lean: " + costPoundA);
        System.out.println("Package B cost per pound of lean: " + costPoundB);

        if (costPoundA < costPoundB){
            System.out.println("Package A is better");
        }else{
            System.out.println("Package B is better");
        }
    }
}
