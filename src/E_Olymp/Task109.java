package E_Olymp;

import java.util.Scanner;

public class Task109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result;

        if (input <= 9) {
            System.out.println(9);
        } else if (input > 9 && input <= 189) {
            result=(input-9)/2;
            System.out.println(result+9);
        } else if (input >= 192 && input<=2889){
            result=(input-189)/3;
            System.out.println(result+99);
        }else if (input>=2893 && input<=7000){
            result=(input-2889)/4;
            System.out.println(result+999);
        }

    }
}
