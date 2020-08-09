package E_Olymp;

import java.util.Scanner;

//100
public class Task935 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 0) {
            input = input / (-1);
        }
        int first = input / 100;
        int second = (input / 10) % 10;
        int third = input % 10;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
