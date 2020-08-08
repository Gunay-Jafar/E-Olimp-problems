package E_Olymp;

import java.util.Scanner;

//100
public class Task929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        if ((a == c && b == d) || (a == b && c == d) || (a == d && b == c))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
