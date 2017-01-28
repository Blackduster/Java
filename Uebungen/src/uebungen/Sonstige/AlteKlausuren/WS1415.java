package uebungen.Sonstige.AlteKlausuren;

/**
 * Created by Achim on 27.01.2017.
 */
public class WS1415 {
    public static void main(String[] args) {
        System.out.println(palindromTest("ot9o".toCharArray()));
    }

    public static boolean palindromTest(char[] feld) {
        boolean erg = true;
        char[] feld2 = new char[feld.length];
        int j = 0;
        for (int i = feld.length - 1; i >= 0; i--) {
            feld2[i] = feld[j];
            j++;
        }
        for (int i = 0; i < feld.length; i++) {
            if (feld[i] == feld2[i])
                System.out.print("");
            else erg = false;
        }
        return erg;
    }
}
