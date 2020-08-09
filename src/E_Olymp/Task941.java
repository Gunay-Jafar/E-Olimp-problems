package E_Olymp;

import java.util.Scanner;

//941
public class Task941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input < 0) {
            input = input / (-1);
        }

        int first = input / 100;
        int second = (input / 10) % 10;
        int third = input % 10;

        int hasil=first*second*third;
        int cem=first+second+third;

        if (input<0){
            hasil=(-1)*hasil;
            cem=(-1)*cem;
        }

        int ferq=hasil-cem;

        System.out.println(ferq);
    }
}
