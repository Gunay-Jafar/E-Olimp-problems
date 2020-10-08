package E_Olymp;

public class Task27 {

    public static void slide(String binaryNumber) {

        //5341

        char[] binaryChars = binaryNumber.toCharArray();
        char lastChar = ' ';

        //[5,3,4,1]

        for (int i = binaryChars.length - 1; i >= 0; i--) {
            if (i == 0) {
                binaryChars[binaryChars.length - 1] = lastChar;
                continue;
            }
            char temp;

            if (i == binaryChars.length - 1) {
                lastChar = binaryChars[i - 1];
                binaryChars[i - 1] = binaryChars[i];
            } else {
                temp = binaryChars[i - 1];
                binaryChars[i - 1] = lastChar;
                lastChar = temp;
            }
        }
        System.out.println(binaryChars);
    }

    public static void main(String[] args) {
        slide("1234");

    }
}
