package E_Olymp;

import java.util.Scanner;

public class Task911 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();


        if(a==0){
            return;
        }
        double D=Math.pow(b,2)-4*a*c ;

        if (D>0){
            int root1= (int) ((-b-Math.sqrt(D))/(2*a));
            int root2= (int) ((-b+Math.sqrt(D))/(2*a));
            if (root1>root2)
            System.out.println("Two roots: "+root2+" "+root1);
            else
                System.out.println("Two roots: "+root1+" "+root2);

        }
        else if(D==0){
            int root=-b/(2*a);
            System.out.println("One root: "+root);
        }
        else
            System.out.println("No root");
    }
}
