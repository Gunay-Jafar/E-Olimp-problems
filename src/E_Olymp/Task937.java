package E_Olymp;

import java.util.Scanner;

public class Task937 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] nums=new int[size+1];
        int[] hasil=new int[size+1];
        int has=1;

        for (int i=1;i<nums.length;i++){
            nums[i]=scanner.nextInt();
        }

        for (int i=1;i<nums.length;i++){
            for (int j=1;j<nums.length;j++){
                hasil[i]=nums[j]*has;
            }
            System.out.println(hasil[i]);
        }
    }
}
