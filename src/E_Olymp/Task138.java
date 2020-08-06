package E_Olymp;

import java.util.Scanner;

public class Task138 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int[] money={10, 20, 50, 100, 200, 500};
        int qaliq;

        for (int i=0;i<money.length;i++){
           if(input!=0){
               qaliq=input/money[i];
           }
        }


    }
}
