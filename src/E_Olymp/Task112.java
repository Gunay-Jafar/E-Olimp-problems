package E_Olymp;

import java.util.Scanner;

//100
public class Task112 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double t1=scanner.nextDouble();
        double t2=scanner.nextDouble();
        double t3=scanner.nextDouble();

        double cem=(1/t1)+(1/t2)+(1/t3);
        double result=1/cem;
        System.out.printf("%.2f",result);
    }


}
