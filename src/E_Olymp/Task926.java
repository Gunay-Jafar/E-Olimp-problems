package E_Olymp;

import java.util.Scanner;

//926
public class Task926 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
        double f=scanner.nextDouble();

        double p1=(a+b+f)/2;
        double p2=(c+d+f)/2;

        double S1=Math.sqrt(p1*(p1-a)*(p1-b)*(p1-f));
        double S2=Math.sqrt(p2*(p2-c)*(p2-d)*(p2-f));

        System.out.printf("%.4f",S1+S2);





    }
}
