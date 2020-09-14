package E_Olymp;

import java.util.Scanner;

public class Task110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int num1 = input / 2;
        int num2 = input - num1;

        if (num1<num2)
            System.out.println(num1);
        else if(num2<num1)
            System.out.println(num2);
        else
            System.out.println("0");
    }
}
