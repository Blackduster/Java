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
            for (; b > 1; b--){
                 summe *= a;
            }
        }
        else if(b == 0) summe = 1;
        else if (b < 0){
            b = abs(b);
            for(; b > 1; b--){
                summe *= a;
            }
            summe = 1.0 / summe;
        }

    return summe;
    }

    public static int abs(int b){
        return (b * (-1));

    }
}
