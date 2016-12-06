package uebungen.Uebungsblatt7;
import java.util.Scanner;

/**
 * Created by awinter on 28.11.16.
 */
public class Exercise1_Rechteck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amountsquare = sc.nextInt();
        double step = 1. /amountsquare;
        double summe = step;




        for (int i = 1; i <= amountsquare; i++){
            double x = (Math.pow(step * i, 2));
            x = Math.sqrt(1. - x);
            summe = summe + x * step;


        }
        System.out.print(summe*4);


    }
}
