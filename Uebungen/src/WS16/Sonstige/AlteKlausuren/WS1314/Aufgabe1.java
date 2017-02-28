package WS16.Sonstige.AlteKlausuren.WS1314;

/**
 * Created by Achim on 19.01.2017.
 */
public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println(istZweistellig(98));
    }

    public static boolean istZweistellig(int zahl) {
        if (zahl < 0) zahl *= -1;
        if (zahl >= 10 && zahl < 100) return true;
        else return false;
    }
}