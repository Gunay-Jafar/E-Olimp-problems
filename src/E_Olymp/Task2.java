package E_Olymp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input=scanner.nextInt();
        int dublicateInput=input;
        int numberOfDigits=0;

        while (input!=0){
            input=input/10;
            numberOfDigits++;
        }

        int[] arr=new int[numberOfDigits];

        for(int i=0;i<numberOfDigits;i++){
            arr[i]=(dublicateInput / (int)Math.pow(10, numberOfDigits - i - 1)) % 10;
        }

        int symCounter=0;

        if (numberOfDigits%2 !=0){
            symCounter++;
        }

        for (int i=0; i<numberOfDigits/2 ;i++){
            if(arr[i]==arr[numberOfDigits-i-1]){
                symCounter++;
            }
        }
        System.out.println("Symmetric"+symCounter);


    }
}
