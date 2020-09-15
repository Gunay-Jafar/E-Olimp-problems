package E_Olymp;

import java.util.Scanner;

public class Task109 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        int qalan=input-9;
        int qalan2;
        int result;

        if (qalan<=180){
            result=qalan/2;
            System.out.println(result+9);
        }else if (qalan>180 && qalan<=2700){
            qalan2=qalan-180;
            result=qalan2/3;
            System.out.println(result+90+9);
        }else if (qalan>2700 && qalan<7000){
            qalan2=qalan-2700;
            result=qalan2/4;
            System.out.println(result+90+9+900);
        }

    }
}
