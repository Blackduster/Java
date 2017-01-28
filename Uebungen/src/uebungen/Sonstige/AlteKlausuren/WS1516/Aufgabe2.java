package uebungen.Sonstige.AlteKlausuren.WS1516;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        System.out.println(testISBN(b));
    }

    public static boolean testISBN(String ISBN) {
        char[] text = ISBN.toCharArray();
        int summe = 0;
        int[] zahl = new int[text.length - 3];
        for (int i = 0; i < zahl.length; i++) {
            for (int j = 0; j < text.length; j++) {
                zahl[i] = (int) (text[j]);
            }
        }
        /*
        zahl[0] = (int) (text[0]);
        zahl[1] = (int) (text[2]);
        zahl[2] = (int) (text[3]);
        zahl[3] = (int) (text[4]);
        zahl[4] = (int) (text[6]);
        zahl[5] = (int) (text[7]);
        zahl[6] = (int) (text[8]);
        zahl[7] = (int) (text[9]);
        zahl[8] = (int) (text[10]);
        zahl[9] = (int) (text[12]);
        */
        for (int i = 0; i < zahl.length; i++) {
            summe += zahl[i] * (i + 1);
        }
        if (summe % 11 == 0) return true;
        else return false;
    }
}
