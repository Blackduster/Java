package WS16.Sonstige.AlteKlausuren.WS1213;

/**
 * Created by Achim on 02.01.2017.
 */
public class Aufgabe2 {
    public static void main(String[] args) {
        char[] encrypted = caesar("JAVA".toCharArray(), 5);
    }

    private static char[] caesar(char[] text, int move) {
        if (allOK(text, move)) {
            for (int i = 0; i < text.length; i++) {
                if ((int) text[i] + move > 90) {
                    int helper = 0;
                    helper = ((int) text[i] + move) - 91;
                    text[i] = (char) (65 + helper);
                } else {
                    text[i] = (char) ((int) text[i] + move);
                }
            }
            return text;
        }
        return null;
    }

    private static boolean allOK(char[] text, int move) {
        boolean allesgross = true;
        boolean movenotneg = true;

        for (int i = 0; i < text.length; i++) {
            if (text[i] >= 'A' && text[i] <= 'Z') {
                System.out.print("");
            } else {
                allesgross = false;
            }
        }
        if (move < 0) movenotneg = false;
        return allesgross && movenotneg;
    }
}
