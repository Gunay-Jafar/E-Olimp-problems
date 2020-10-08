package Algoritms;

import java.util.Scanner;

public class OklidAlgo {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q; // 3
        return gcd(q, r); //6,3
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt(); //75
        int q = scanner.nextInt(); //6
        System.out.println(gcd(p, q));
    }
}
