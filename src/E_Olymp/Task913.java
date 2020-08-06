package E_Olymp;

import java.util.Scanner;

public class Task913 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pair=scanner.nextInt();
        double[]nums1=new double[pair];
        double[]nums2=new double[pair];


        for (int j=0;j<nums1.length;j++){
        for(int i=0;i<nums1.length;i++){
            nums1[i]=scanner.nextDouble();
            nums2[i]=scanner.nextDouble();

        }
        System.out.printf("%.2f");
        System.out.print(" ");
        System.out.printf("%.2f");
        }








    }



}
