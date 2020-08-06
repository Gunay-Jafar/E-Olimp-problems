package E_Olymp;

import java.util.Scanner;

//100
public class Task923 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        if (input==1 || input==2 || input==12)
            System.out.println("Winter");
            else if (input==3 || input==4 || input==5)
            System.out.println("Spring");
        else if (input==6 || input==7 || input==8)
            System.out.println("Summer");
        else if (input==9 || input==10 || input==11)
            System.out.println("Autumn");






    }
}
