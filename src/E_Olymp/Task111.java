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
        int hours;

        if (part2.equals("00")){
            hours=Integer.parseInt(part3)-Integer.parseInt(part1)+1;
        }else {
            hours=Integer.parseInt(part3)-Integer.parseInt(part1);
        }

        say+=hours;


        System.out.println(say);
    }
}
