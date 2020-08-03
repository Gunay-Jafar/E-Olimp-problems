package E_Olymp;

import java.util.Scanner;

//100
public class Task904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();

        int[] nums=new int[count];
        int[] newNums=new int[count];


        for (int i=0;i<count;i++) {
            nums[i]= scanner.nextInt();


            if(nums[i]>=0) {
                newNums[i] = nums[i] + 2;

            }
            else {
                newNums[i] = nums[i];

            }
            if (i!=0)
                System.out.print(" ");

            System.out.print(newNums[i]);


        }


    }

    }

