package E_Olymp;

import java.util.Scanner;

public class Task905 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] teref=new int[3];

        for (int i=0;i<=teref.length;i++){
            teref[i]= scanner.nextInt();

            if(teref[0]==teref[1] && teref[1]==teref[2]){
                System.out.println("1");
            }
            else if(teref[0]==teref[1] || teref[1]==teref[2] || teref[0]==teref[2]){
                System.out.println("2");
            }else{
                System.out.println("3");
        }}


    }
}
