package uebungen.Sonstige.AlteKlausuren.WS1213;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(istDifferenz(9.87, 7.34));
    }

    public static double istDifferenz(double zahl1, double zahl2) {
        if (zahl1 > zahl2) {
            return zahl1 - zahl2;
        } else {
            return zahl2 - zahl1;
        }
    }
}
