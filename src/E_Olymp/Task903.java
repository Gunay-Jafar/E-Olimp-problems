package E_Olymp;

import java.util.Scanner;

//100
public class Task903 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        int first=input/100;

        int last=input%10;

        if (first>last)
            System.out.println(first);
        else if(last>first)
            System.out.println(last);
        else
            System.out.println("=");

    }
}
