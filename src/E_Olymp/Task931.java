package E_Olymp;

import java.util.Scanner;

//100
public class Task931 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int qaliq;
        int hasil=1;
        int cem=0;

        while (input!=0){
            qaliq=input%10;
            hasil=hasil*qaliq;
            cem=cem+qaliq;
            input=input/10;
        }

        double qismet=(double)hasil/(double)cem;

        System.out.printf("%.3f",qismet);

    }
}
