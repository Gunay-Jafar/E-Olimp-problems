package E_Olymp;

import java.util.Scanner;

public class Task1602 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(ekob(a,b));

    }

     static int ebob(int a ,int b){
        if(a%b==0) return b;
        return ebob(b, a%b);
    }

      static int ekob(int a,int b){
        if (a%b==0) return a;
        return a*b / ebob(a,b);
    }
}
