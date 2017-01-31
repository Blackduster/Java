package uebungen.Sonstige.AlteKlausuren.WS1516;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = "3-446-44346-0";
        System.out.println(testISBN(b));
    }

    public static boolean testISBN(String ISBN) {
        char[] text = ISBN.toCharArray();
        int summe = 0;
        int zaehler = 0;
        int[] zahl = new int[15];
        for (int i = 0; i < text.length; i++) {
            if (text[i] == '-')
                continue;
            else
                zahl[zaehler] = (int) text[i] - 48;
            zaehler++;
        }
        for (int i = 0; i < zahl.length; i++) {
            summe += zahl[i] * (i + 1);
        }
        if (summe % 11 == 0) return true;
        else return false;
    }
}
