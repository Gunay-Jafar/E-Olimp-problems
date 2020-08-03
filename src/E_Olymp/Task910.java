package E_Olymp;

import java.util.Scanner;

//100
public class Task910 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        double [] nums=new double[size];
        int numCount=0;
        int minusNumCount=0;
        double numSum=0;

        for (int i=0;i<size;i++){
            nums[i]=scanner.nextDouble();
            if(nums[i]<=0){
                minusNumCount++;
            }
            else if(nums[i]>0){
            numCount++;
            numSum+=nums[i];
            }
        }

        if(minusNumCount==size)
            System.out.println("Not Found");
        else
            System.out.printf("%.2f",numSum / numCount);

    }
}
