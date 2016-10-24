package uebungen.Uebungsblatt2;

/**
 * Created by awinter on 24.10.16.
 */
public class Ueb2_Aufgabe3 {

    public static void main(String[] args){
        double p = 10;
        double q = 5;

        double ergebnis1 = -(p/2) + Math.sqrt((Math.pow((p/2), 2)) - q);
        double ergebnis2 = -(p/2) - Math.sqrt((Math.pow((p/2), 2)) - q);

        System.out.println(ergebnis1);
        System.out.println(ergebnis2);


    }
}
