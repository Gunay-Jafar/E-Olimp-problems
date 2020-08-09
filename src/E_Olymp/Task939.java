package E_Olymp;

import java.util.Scanner;

//100
public class Task939 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int a=input/10;
        int b=input%10;

        int kvadrat= (int) Math.pow((a+b),2);

        System.out.println(kvadrat);
    }
}
