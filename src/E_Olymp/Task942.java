package E_Olymp;

import java.util.Scanner;

//100
public class Task942 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();
        double x2=scanner.nextDouble();
        double y2=scanner.nextDouble();
        double x3=scanner.nextDouble();
        double y3=scanner.nextDouble();
        double x4=scanner.nextDouble();
        double y4=scanner.nextDouble();

        double x=(x1+x3)/2;
        double y=(y1+y3)/2;


        double D1=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
        double D2=Math.sqrt(Math.pow((x2-x4),2)+Math.pow((y2-y4),2));

        System.out.printf("%.3f",x);
        System.out.print(" ");
        System.out.printf("%.3f",y);
        System.out.println(" ");
        System.out.printf("%.3f",D1);
        System.out.print(" ");
        System.out.printf("%.3f",D2);


    }
}
