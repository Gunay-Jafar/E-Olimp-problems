package Developia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            }
        }

        int maxInt=-1;
        char ch=' ';

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue()>=maxInt) {
                maxInt = entry.getValue();
                ch=entry.getKey();
            }
        }
        System.out.println(ch+" "+ maxInt);
    }
}
