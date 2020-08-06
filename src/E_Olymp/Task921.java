package E_Olymp;

import java.util.Scanner;

//100
public class Task921 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        double[] nums=new double[count+1];

        int countMin=0;
        double sum=0;

        for (int i=1;i<count+1;i++){
            nums[i]=scanner.nextDouble();
            if(nums[i]<0){
                countMin++;
                sum+=nums[i];
            }

        }
        System.out.print(countMin+" ");
        System.out.printf("%.2f",sum);
    }
}
