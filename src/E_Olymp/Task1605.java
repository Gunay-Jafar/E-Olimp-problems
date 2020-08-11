package E_Olymp;


import java.util.Scanner;

//100
public class Task1605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = 1;

        if (str.charAt(0) == '-')
            index++;

        System.out.println(str.charAt(index));


    }
}
