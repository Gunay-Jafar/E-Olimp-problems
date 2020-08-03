package E_Olymp;

import java.util.Scanner;

//100
public class Task908 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();

        int [] arr=new int[count];

        int bolunenSayi=0;
        int sum=0;

        for (int i=0;i<count;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0 && arr[i]%3==0 && arr[i]>0){
                bolunenSayi++;
                sum+=arr[i];
            }

        }

        System.out.print(bolunenSayi+" ");
        System.out.print(sum);

    }
}
