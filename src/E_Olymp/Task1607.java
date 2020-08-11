package E_Olymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1607 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> list = new ArrayList<>();


        while (input != 0) {
            int qaliq = input % 10;
            list.add(qaliq);
            input = input / 10;
        }

        for (int c: list){
            System.out.print(c);
        }


    }
}
