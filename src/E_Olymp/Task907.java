package E_Olymp;

import java.util.Scanner;

public class Task907 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        boolean a=true;

        double[] nums=new double[count];

        for (int i=0;i<count;i++){
            nums[i]=scanner.nextDouble();
            if (nums[i]<2.5 && nums[i]>0){
                System.out.print(i+" ");
                System.out.printf("%.2f",nums[i]);
                break;
            }
        }

        for (int i=0;i<count;i++){
            if (nums[i]>=2.5)
                System.out.println("Not found");
        }


    }
}
