package E_Olymp;

import java.util.Scanner;

//100
public class Task925 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();
        double x2=scanner.nextDouble();
        double y2=scanner.nextDouble();
        double x3=scanner.nextDouble();
        double y3=scanner.nextDouble();

        double a=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        double b=Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        double c=Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));

        double p=(a+b+c)/2;

        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.printf("%.4f",(a+b+c));
        System.out.print(" ");
        System.out.printf("%.4f",s);

    }
}
