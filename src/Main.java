import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

         Scanner superScan = new Scanner(System.in);

        System.out.println("Input one number");

         double A = superScan.nextDouble();

        System.out.println("Input one more number");

        double B = superScan.nextDouble();

        double C = A+B;
        double D = A-B;
        double E = A*B;
        double F = A/B;



        System.out.println("Your number is =" + A);
        System.out.println("Your second number is =" + B);
        System.out.println("Summe =" + C);
        System.out.println("Subtrakt =" + D);
        System.out.println("Multi =" + E);
        System.out.println("Dividiren =" + F);


    }
}