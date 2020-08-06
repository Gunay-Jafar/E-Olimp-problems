package E_Olymp;

import java.util.Scanner;

//100
public class Task920 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        double z=scanner.nextDouble();

        double minNum=minNum(x,y,z);

        System.out.printf("%.2f",minNum);
    }

    public static double minNum(double x,double y,double z){
        double max1=Math.max(x,y);
        double max2=Math.max(y,z);
        double sum=x+y+z;
        double min=Math.min(max1,max2);
        double minEnd=Math.min(min,sum);
        return minEnd;
    }
}
