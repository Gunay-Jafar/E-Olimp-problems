package E_Olymp;

import java.util.Scanner;

public class Task902 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        if (1<=input && input<=3)
            System.out.println("Initial ");
        else if (4<=input && input<=6)
            System.out.println("Average");
        else if (7<=input && input<=9)
            System.out.println("Sufficient ");
        else if (10<=input && input<=12)
            System.out.println("High ");
    }
}
