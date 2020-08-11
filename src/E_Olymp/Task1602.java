package E_Olymp;

import java.util.Scanner;

//100
public class Task1602 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a=scanner.nextLong();
        long b=scanner.nextLong();
        System.out.println(ekob(a,b));

    }

     static long ebob(long a ,long b){
        if(a%b==0) return b;
        return ebob(b, a%b);
    }

      static long ekob(long a,long b){
        if (a%b==0) return a;
        return a*b / ebob(a,b);
    }
}
