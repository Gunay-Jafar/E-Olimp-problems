package E_Olymp;


public class Task3 {

    public static void slide(String binaryNumber) {
        // 4829
        char[] binarChars = binaryNumber.toCharArray();
        // [4,8,2,9]
        //  0 1 2 3

        char lastChar = ' ';

        for (int i = binarChars.length - 1; i >= 0 ; i --) {

            // i == 0

            if (i == 0) {
                binarChars[binaryNumber.length() - 1] = lastChar; // [8 2 9 4]
                continue;
            }

            char temp;

            // i == 3
            if (i == binarChars.length - 1) {
                lastChar = binarChars[i - 1]; // 2
                binarChars[i - 1] = binarChars[i];   // [4 8 9 9]
                // [0 1 2 3]
            }
            else {
                // i==1

                temp = binarChars[i - 1]; // temp = 4
                binarChars[i - 1] = lastChar; // // [8 2 9 9]
                lastChar = temp;              // lastChar = 4
            }
        }

        System.out.println(binarChars);
    }
    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt(); // 123456

        slide("4829");
        System.out.println();
    }




    }

