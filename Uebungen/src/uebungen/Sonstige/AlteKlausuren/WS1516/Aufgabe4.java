package uebungen.Sonstige.AlteKlausuren.WS1516;

/**
 * Created by Achim on 28.01.2017.
 */
public class Aufgabe4 {
    public static void main(String[] args) {

        Aufgabe3[] Spind = new Aufgabe3[100];
        for (int i = 0; i < 100; i++) {
            Spind[i] = new Aufgabe3(i);
            Spind[i].setLock(true);
        }

        int x = 0;
        for (int i = 1; i <= Spind.length; i++) {

            for (; x < Spind.length; x += i) {
                Spind[x].setLock(!Spind[x].getLock());
            }

            x = i;
            for (int j = 0; j < 99; j++) {
                System.out.print(Spind[j].toString());
            }
            System.out.println("");
        }


    }
}
