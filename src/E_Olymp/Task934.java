package E_Olymp;

import java.util.Scanner;

//100
public class Task934 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        double P=(double) (a+b+c)/2;
        double S=Math.sqrt(P*(P-a)*(P-b)*(P-c));

        double ha=(2*S)/a;
        double hb=(2*S)/b;
        double hc=(2*S)/c;

        System.out.printf("%.2f",ha);
        System.out.print(" ");
        System.out.printf("%.2f",hb);
        System.out.print(" ");
        System.out.printf("%.2f",hc);

    }
}
