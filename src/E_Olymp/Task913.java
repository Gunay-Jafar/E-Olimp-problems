package E_Olymp;

import java.util.Scanner;

//100
public class Task913 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pair = scanner.nextInt();

        for (int j = 0; j < pair; j++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.printf("%.4f", a + b);
            System.out.print(" ");
            System.out.printf("%.4f", a * b);
            System.out.println();
        }

    }
}
