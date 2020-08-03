package E_Olymp;

import java.util.Scanner;

public class Task915 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] teref=new int[3];
        int[] little=new int[2];

        int max=0;

        for (int i=0;i<teref.length;i++){
            teref[i]=scanner.nextInt();
            if (teref[i]<=0)
                return;
            if(teref[i]>max)
                max=teref[i];

        }
        for (int i=0;i<little.length;i++){
            if (teref[i]!=max){
                little[i]=teref[i];
            }
        }



        if (Math.pow(max,2)==Math.pow(little[0],2)+Math.pow(little[1],2))
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
