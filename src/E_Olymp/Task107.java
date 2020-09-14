package E_Olymp;

import java.util.Scanner;

public class Task107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int yuzlukSayi = input / 100;
        int qaliq = input - yuzlukSayi * 100;

        int iyirmilikSayi = qaliq / 20;
        int qaliq2 = qaliq - iyirmilikSayi * 20;

        if (qaliq >=65) {
            System.out.println(yuzlukSayi * 100 + 100);
        } else {
            System.out.println(yuzlukSayi * 100 + iyirmilikSayi * 30 + qaliq2 * 2);
        }


    }
}
