package E_Olymp;

import java.util.Scanner;

public class Task933 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int qaliq;
        int cem=0;

        while (input!=0){
            qaliq=input%10;
            cem+=qaliq;
            input=input/10;
        }
        System.out.println(cem);
    }
}
