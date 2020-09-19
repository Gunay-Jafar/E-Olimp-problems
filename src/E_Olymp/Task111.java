package E_Olymp;

import java.util.Scanner;

public class Task111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String[] parts = time.split(" ");
        String part1 = parts[0]; //13
        String part2 = parts[1]; //30
        String part3 = parts[2]; //15
        String part4 = parts[3]; //10

        int say = 0;

        if (part2.equals("30")) {
            say++;
        }
        if (part4.equals("30")) {
            say++;
        }
        if (part2.equals("00")) {
            int n = Integer.parseInt(part1);
            if (n > 12) {
                n = n - 12;
            }
            say += n;
        }
        if (part4.equals("00")) {
            int z = Integer.parseInt(part3);
            if (z > 12) {
                z = z - 12;
            }
            say += z;
        }
        System.out.println(say);
    }
}
