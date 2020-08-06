package E_Olymp;

import java.util.Scanner;

public class Task907 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        boolean isAllBig=true;

        float[] nums=new float[count];

        for (int i=0;i<count;i++){
            nums[i]=scanner.nextFloat();
            if (nums[i]<=2.5){
                System.out.print((i+1)+" ");
                System.out.printf("%.2f",nums[i]);
                System.out.println();
                isAllBig=false;
                break;

            }
        }

            if (isAllBig)
                System.out.println("Not found");



    }
}
