package E_Olymp;

import java.util.Scanner;

public class Task917 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        double[] nums=new double[count];

        double min =0;

        for (int i=0;i<nums.length;i++){
            nums[i]=scanner.nextDouble();
            min=nums[0];
            if(nums[i]<min)
                min=nums[i];
        }
        System.out.printf("%.2f",2*min);
    }
}
