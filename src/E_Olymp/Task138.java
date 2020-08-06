package E_Olymp;

import java.util.Scanner;

//100
public class Task138 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        int qaliq;
        int azn500=input/500;
        qaliq=input%500;

        int azn200=qaliq/200;
        qaliq=qaliq%200;

        int azn100=qaliq/100;
        qaliq=qaliq%100;

        int azn50=qaliq/50;
        qaliq=qaliq%50;

        int azn20=qaliq/20;
        qaliq=qaliq%20;

        int azn10=qaliq/10;
        qaliq=qaliq%10;

        if (qaliq!=0)
            System.out.println("-1");
        else
            System.out.println(azn500+azn200+azn100+azn50+azn20+azn10);


    }
}
