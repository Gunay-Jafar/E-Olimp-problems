package E_Olymp;

import java.util.Scanner;

//100
public class Task927 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        double[] nums=new double[count];
        int [] numsToy=new int[count];
        int countNum=0;

        for (int i=0;i<count;i++){
            numsToy[i]=scanner.nextInt();
            nums[i]=scanner.nextDouble();
            if (nums[i]<50)
                countNum+=numsToy[i];

        }
        System.out.println(countNum);
    }
}
