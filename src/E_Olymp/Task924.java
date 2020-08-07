package E_Olymp;

import java.util.Scanner;

//100
public class Task924 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double saheHalqa=scanner.nextDouble();
        double xariciRadius=scanner.nextDouble();

        double sCevre=Math.PI*xariciRadius*xariciRadius;
        double ferqSahe=sCevre-saheHalqa;

        double radius=Math.sqrt(ferqSahe/Math.PI);

        System.out.printf("%.2f",radius);

    }
}
