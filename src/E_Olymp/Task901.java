package E_Olymp;

import java.util.Scanner;

//100
public class Task901 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int num=0;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='-' || str.charAt(i)=='+' || str.charAt(i)=='*' ){
                num++ ;
            }
        }
        System.out.println(num);

    }
}
