package E_Olymp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//100
public class Task113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] mas = new int[a];

        HashMap<Integer, Integer> has = new HashMap<>();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            if (!has.containsKey(mas[i])) {
                has.put(mas[i],1);
            }else {
                has.put(mas[i],has.get(mas[i])+1);
            }
        }

        int max=0;
        for (Map.Entry<Integer, Integer> entry : has.entrySet()) {
             int key = entry.getValue();
            if (key>max)
                max=key;
        }
        System.out.println(a-max);

    }
}
