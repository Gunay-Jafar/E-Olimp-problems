package E_Olymp;

import java.util.Scanner;

//100
public class Task909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        boolean isLetter=false;
        int countStr=0;

        for (int i=0;i<input.length();i++){
            if((input.charAt(i)>='a' && input.charAt(i)<='z' )||
                    (input.charAt(i)>='A' && input.charAt(i)<='Z')){

                if(isLetter!=true)
                countStr++;
                isLetter=true;

            }else if(input.charAt(i)==' ' || input.charAt(i)=='.'
                    || input.charAt(i)=='!'|| input.charAt(i)==','){
                isLetter=false;

            }
        }
        System.out.println(countStr);
    }
}
