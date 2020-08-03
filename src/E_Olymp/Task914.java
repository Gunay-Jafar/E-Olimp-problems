package E_Olymp;

import java.util.Scanner;

//100
public class Task914 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();

        double[] nums=new double[size];

        double max=0;

        for (int i=0;i<size;i++){
            nums[i]=scanner.nextDouble();
            if(Math.abs(nums[i])>max)
                max=Math.abs(nums[i]);
        }
        System.out.printf("%.2f",max);
    }
}
