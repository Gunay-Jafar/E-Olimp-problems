package E_Olymp;

import java.util.Scanner;

//100
public class Task1601 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println(ebob(a,b));
    }

    public static int ebob(int a ,int b){
        if(a%b==0) return b;
        return ebob(b, a%b);
    }
}
