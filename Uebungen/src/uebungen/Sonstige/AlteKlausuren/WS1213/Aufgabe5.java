package uebungen.Sonstige.AlteKlausuren.WS1213;

import java.util.Scanner;

/**
 * Created by Achim on 19.01.2017.
 */
public class Aufgabe5 {
    public static void main(String[] args) {
        char[][] test = initalisiereSchabrett();
        System.out.println(test[6][7]);
    }

    public static char[][] initalisiereSchabrett() {
        char[][] Schachbrett = new char[8][];
        for (int i = 0; i < 7; i++) {

            Schachbrett[i] = new char[8];
            Schachbrett[i][0] = 'L';
            Schachbrett[i][1] = 'B';
            Schachbrett[i][2] = 'L';
            Schachbrett[i][3] = 'L';
            Schachbrett[i][4] = 'L';
            Schachbrett[i][5] = 'L';
            Schachbrett[i][6] = 'B';
            Schachbrett[i][7] = 'L';

        }
        return Schachbrett;
    }
}


