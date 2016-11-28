package uebungen.Uebungsblatt6;
import java.util.Scanner;

/**
 * Created by awinter on 21.11.16.
 */
public class Exercise4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Bitte geben Sie die Basis ein: ");
        double a = sc.nextDouble();
        System.out.print("Bitte geben Sie den Exponenten ein: ");
        int b = sc.nextInt();
        System.out.println(pow(a, b));
    }

    public static double pow(double a, int b){
        double summe = a;
        if(b > 0){
            summe = powi(a, b);
        }
        else if(b == 0) summe = 1;
        else if (b < 0){
            summe = 1.0 / powi(a, abs(b));
        }
    return summe;
    }

    public static int abs(int b){
        if (b < 0) return (b * (-1));
        else if (b == 0) return 0;
        else if (b > 0) return b;
        else return 0;
    }

    private static double powi(double a, int b) {
        double summe = a;
        for (; b > 1; b--) {
            summe *= a;
        }
        return summe;
    }
}
