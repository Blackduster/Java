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

        for (int i = 0; i < zahl.length; i++) {
            summe += zahl[i] * (i + 1);
        }
        if (summe % 11 == 0) return true;
        else return false;
    }
}
