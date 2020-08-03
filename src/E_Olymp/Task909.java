package E_Olymp;

import java.util.Scanner;

public class Task909 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int countString=0;

        for (int i=0;i<input.length();i++){
            if(input.charAt(i)=='!' || input.charAt(i)==' ' || input.charAt(i)=='.' || input.charAt(i)==','){
                countString++;
            }

        }
        System.out.println(countString);
    }
}
