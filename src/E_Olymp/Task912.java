package E_Olymp;

import java.util.Scanner;

public class Task912 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;

        while( scanner.hasNextLine()) {
            String str=scanner.nextLine();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='!' || str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)==';')
                    count++;

            }
        }

        System.out.println(count);
    }

}
