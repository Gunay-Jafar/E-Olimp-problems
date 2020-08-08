package E_Olymp;

import java.util.Scanner;

//100
public class Task932 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sahe = scanner.nextDouble();
        double a = scanner.nextDouble();


        double D = Math.pow(a, 2) + 8 * sahe;
        double h = ((-a) + Math.sqrt(D)) / 2;

        System.out.printf("%.2f", h);


    }
}
