package Lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int us = 1;
        int bs = n - 1;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < bs; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < us; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
            us += 2;
            bs--;
        }
    }
}
