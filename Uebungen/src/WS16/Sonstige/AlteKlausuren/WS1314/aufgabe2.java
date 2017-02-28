package WS16.Sonstige.AlteKlausuren.WS1314;

/**
 * Created by Achim on 27.01.2017.
 */
public class aufgabe2 {
    public static void main(String[] args) {
        int[] test = {1, 5, 6, 9, 4};
        test = sortiereAbsteigend(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public static int[] sortiereAbsteigend(int[] feld) {
        int hilf;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld.length; j++) {
                if (feld[i] > feld[j]) {
                    hilf = feld[i];
                    feld[i] = feld[j];
                    feld[j] = hilf;
                }
            }
        }
        return feld;
    }
}
