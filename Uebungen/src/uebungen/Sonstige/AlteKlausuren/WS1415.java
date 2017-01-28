package uebungen.Sonstige.AlteKlausuren;

/**
 * Created by Achim on 27.01.2017.
 */
public class WS1415 {
    public static void main(String[] args) {

        System.out.println(palindromTest("stets".toCharArray()));
    }

    public static boolean palindromTest(char[] feld) {
        int j = 0;
        for (int i = feld.length - 1; i > 0; i--) {
            if (feld[i] != feld[j])
                return false;
            else
                j++;
        }
        return true;
    }
}
