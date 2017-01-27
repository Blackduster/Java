package uebungen.Sonstige.AlteKlausuren.WS1314;

/**
 * Created by Achim on 27.01.2017.
 */
public class Aufgabe3 {
    public static void main(String[] args) {
        int[] a = {0, 4, 2};
        int[] b = {6, 2, 9};
        System.out.println(addierer(a, b));
    }

    public static int addierer(int[] a, int[] b) {
        int erg1 = a[0];
        int erg2 = b[0];
        for (int i = 1; i < a.length; i++) {
            erg1 = erg1 * 10;
            erg1 = erg1 + a[i];
        }
        for (int j = 1; j < a.length; j++) {
            erg2 = erg2 * 10;
            erg2 = erg2 + b[j];
        }
        return erg1 + erg2;
    }
}
