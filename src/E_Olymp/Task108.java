package E_Olymp;

import java.util.Scanner;

//100
public class Task108 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        if ((a>b && a<c) ||(a<b && a>c))
            System.out.println(a);
        else if ((b>a && b<c) ||(b<a && b>c))
            System.out.println(b);
        else System.out.println(c);




    }
}
