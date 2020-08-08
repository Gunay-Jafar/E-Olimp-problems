package E_Olymp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//100
public class Task930 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        ArrayList<Character> arrayList = new ArrayList<>();

        HashMap<Character, Boolean> phoneNum = new HashMap<>();
        phoneNum.put('0', false);
        phoneNum.put('1', false);
        phoneNum.put('2', false);
        phoneNum.put('3', false);
        phoneNum.put('4', false);
        phoneNum.put('5', false);
        phoneNum.put('6', false);
        phoneNum.put('7', false);
        phoneNum.put('8', false);
        phoneNum.put('9', false);


        for (int i = 0; i < num.length(); i++) {
            phoneNum.put(num.charAt(i), true);
        }

        for (Map.Entry<Character, Boolean> entry : phoneNum.entrySet()) {
            if (!entry.getValue()) {
                arrayList.add(entry.getKey());
            }
        }

        System.out.println(arrayList.size());

        for (Character c: arrayList){
            System.out.print(c+" ");
        }

    }
}
