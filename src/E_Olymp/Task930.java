package E_Olymp;

import java.util.Scanner;

public class Task930 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int say=0;

        for (int i=0;i<nums.length;i++){
            int a=scanner.nextInt();
            if (a!=nums[i]){
                say++;
            }
        }
        System.out.println(say);



    }
}
