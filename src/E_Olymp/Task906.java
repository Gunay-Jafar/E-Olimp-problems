package E_Olymp;

import java.util.Scanner;

//100
public class Task906 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        int num1=input/100;
        int num2=input%10;
        int num3=(input/10)%10;

        System.out.println(num1*num2*num3);
    }
}
