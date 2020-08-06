package E_Olymp;

import java.util.Scanner;

public class Task922 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int [] numbers=new int[count];
        int lastNum=0;

        for (int i=0;i<count;i++){
            numbers[i]=scanner.nextInt();
        }

        for (int i=numbers.length-1;i>=0;i--){
            if (i==0){
               lastNum=numbers[numbers.length-1];
            }
        }

    }
}
