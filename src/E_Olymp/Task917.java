package E_Olymp;

import java.util.Scanner;

//100
public class Task917 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        double[] nums=new double[count];

        double min=Double.MAX_VALUE;

        for (int i=0;i<nums.length;i++){
            nums[i]=scanner.nextDouble();
            if(nums[i]<min)
                min=nums[i];
        }
        System.out.printf("%.2f",2*min);
    }
}
