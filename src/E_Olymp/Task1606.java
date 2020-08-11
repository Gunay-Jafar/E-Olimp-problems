package E_Olymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        if (input<0){
            input*=(-1);
        }

        while (input != 0) {
            int qaliq = input % 10;
            list.add(qaliq);
            input = input / 10;
        }
        System.out.println(list.get(0) + list.get(list.size() - 1));


    }
}
