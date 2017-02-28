package WS16.Uebungsblatt2;
import java.util.Scanner;


/**
 * Created by awinter on 24.10.16.
 */
public class Ueb2_Aufgabe2 {

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);
        System.out.print("Radius eingeben: ");
        //Kreisberechnungen
        double r = sc.nextDouble();
        System.out.println("Kreisfläche: " + (Math.pow(r, 2) * Math.PI));
        System.out.println("Kreisumfang: " + (2 * r * Math.PI) + "\n");

        //Kugelberechnung

        System.out.println("Kugelvolumen: " + ((4/3.0)* Math.PI * Math.pow(r, 3)));




    }
}
