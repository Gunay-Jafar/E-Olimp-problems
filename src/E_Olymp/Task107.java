package E_Olymp;

import java.util.Scanner;

public class Task107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int yuzlukSayi = input / 100;
        int qaliq = input % 100;

        if (qaliq > 65)
            qaliq = 65;

        int iyirmilikSayi = qaliq / 20;
        int qaliq2 = qaliq % 20;

        if (qaliq2 > 15)
            qaliq2 = 15;

        if (qaliq >= 65) {
            System.out.println(yuzlukSayi * 100 + 100);
        } else if (qaliq >= 16 && qaliq <= 19) {
            System.out.println(yuzlukSayi * 100 + 30);
        } else {
            System.out.println(yuzlukSayi * 100 + iyirmilikSayi * 30 + qaliq2 * 2);
        }
    }
}
