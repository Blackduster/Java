package WS16.Sonstige.AlteKlausuren.WS1516;

/**
 * Created by Achim on 27.01.2017.
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println(berechneProzent(30, 5));
    }

    public static double berechneProzent(int zahl, int prozent) {
        if (zahl < 0 || prozent < 0) return -1.0;
        return ((prozent * zahl) / 100.0);
    }
}
