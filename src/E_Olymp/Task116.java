package E_Olymp;

import java.util.Scanner;

public class Task116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputA = scanner.nextInt();
        int inputC = scanner.nextInt();
        int inputB = inputA-1;

        do {
            inputB++;
            if (inputB % inputC == 0) {
                System.out.println(inputB + 1);
            }
        } while (inputB % inputC != 0);


    }
}
