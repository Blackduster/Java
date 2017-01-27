package uebungen.Sonstige.AlteKlausuren.WS1314;

/**
 * Created by Achim on 27.01.2017.
 */
public class Schachbrett {
    public static void main(String[] args) {
        boolean[][] test = setzeTurm(3, 5);
        gibBedrohteFelderAus(test);
    }

    public static boolean[][] setzeTurm(int x, int y) {
        boolean[][] brett = new boolean[8][8];
        for (int i = 0; i <= 7; i++) {
            if (i == x) {
                for (int j = 0; j <= 7; j++) {
                    brett[i][j] = true;
                }
            }
            for (int j = 0; j <= 7; j++) {
                if (j == y) {
                    brett[i][j] = true;
                }
            }
        }
        return brett;
    }

    public static void gibBedrohteFelderAus(boolean[][] feld) {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (feld[i][j] == true)
                    System.out.print('x');
                else System.out.print('o');
            }
            System.out.println("");
        }
    }
}
