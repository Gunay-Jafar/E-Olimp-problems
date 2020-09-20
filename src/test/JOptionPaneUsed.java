package test;

import javax.swing.*;
import java.util.Random;

public class JOptionPaneUsed {
    public static void main(String[] args) {
        int i = 1;
        Random r = new Random();
        int num = r.nextInt(10);

        while (true) {
            String tahmin = JOptionPane.showInputDialog("Tahmin gir:");
            int t = Integer.parseInt(tahmin);
            if (t == num) {
                String mesaj = "Tahmin dogru!-" + i + " tahminde bildiniz!";
                JOptionPane.showMessageDialog(null, mesaj);
                break;
            } else i++;
        }
    }
}
