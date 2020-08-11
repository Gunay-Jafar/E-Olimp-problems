package E_Olymp;

import java.util.Scanner;

public class Task1604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int qaliq;
        int hasil = 1;

        while (input != 0) {
            qaliq = input % 10;
            if (qaliq % 2 == 0){
                hasil *= qaliq;
            }
            input = input / 10;
        }

        if (hasil == 1)
            System.out.println("-1");
        else
            System.out.println(hasil);


    }


}
