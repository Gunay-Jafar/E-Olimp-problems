package E_Olymp;

import java.util.Scanner;

//100
public class Task919 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        double[] nums =new double[count+1];
        int countPositive=0;
        double sumPositive=0;

        for (int i=1;i<count+1;i++){
            nums[i]=scanner.nextDouble();
            if (i%3==0 && nums[i]>0){
                countPositive++;
                sumPositive+=nums[i];
            }
        }
        System.out.print(countPositive+" ");
        System.out.printf("%.2f",sumPositive);
    }
}
