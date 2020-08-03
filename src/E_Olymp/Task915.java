package E_Olymp;

import java.util.Scanner;

//100
public class Task915 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int side1=scanner.nextInt();
        int side2=scanner.nextInt();
        int side3=scanner.nextInt();



        if (side1>side2 && side1>side3){
            if (Math.pow(side1,2)==Math.pow(side2,2)+Math.pow(side3,2)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        else if (side2>side1 && side2>side3){
            if (Math.pow(side2,2)==Math.pow(side1,2)+Math.pow(side3,2)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        else{
            if (Math.pow(side3,2)==Math.pow(side1,2)+Math.pow(side2,2)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }




    }
}
