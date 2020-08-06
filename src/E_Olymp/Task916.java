package E_Olymp;

import java.util.HashMap;
import java.util.Scanner;

//100
public class Task916 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int temp1=Math.min(a,b);
        int temp2=Math.max(a,b);
        a=temp1;
        b=temp2;
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        temp1=Math.min(c,d);
        temp2=Math.max(c,d);
        c=temp1;
        d=temp2;

        HashMap<Integer,Boolean> map = new HashMap<>();


        for (int i=a;i<=b;i++){
            for (int j=c;j<=d;j++){
                if (!map.containsKey(i*j))
                map.put(i*j,true);
            }
        }
        System.out.println(map.size());

    }
}
