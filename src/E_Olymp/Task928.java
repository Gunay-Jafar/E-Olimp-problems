package E_Olymp;

import java.util.Scanner;

//100
public class Task928 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int[] nums=new int[count];

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        for (int i=0;i<count;i++){
            nums[i]=scanner.nextInt();
            if (nums[i]<max){
                max=nums[i];
            }
            if (nums[i]>min){
                min=nums[i];
            }
        }
        System.out.println(max+min);

    }
}
