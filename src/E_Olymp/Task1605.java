package E_Olymp;

import java.util.Scanner;

public class Task1605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int copy = input;
        int say = 0;

        while (input != 0) {
            int qaliq = input % 10;
            say++;
            input = input / 10;
        }

        say = say - 2;

        double second = (copy / Math.pow(10, say)) % 10;

        System.out.println((int)second);


    }
}
