package WS16.Uebungsblatt3;
import java.util.Scanner;

/**
 * Created by awinter on 31.10.16.
 * Pizzarechner
 */
public class Aufgabe2 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int piz1Durch;
        float piz1Price;
        int piz2Durch;
        float piz2Price;
        double piz1flaeche;
        double piz2flaeche;

        System.out.print("Bitte Durchmesser der ersten Pizza eingeben: ");
        piz1Durch = sc.nextInt();
        System.out.print("Bitte Preis der ersten Pizza eingeben: ");
        piz1Price = sc.nextInt();

        System.out.print("Bitte Durchmesser der zweiten Pizza eingeben: ");
        piz2Durch = sc.nextInt();
        System.out.print("Bitte Preis der zweiten Pizza eingeben: ");
        piz2Price = sc.nextInt();

        //Berechnung
        piz1flaeche = Math.PI * (Math.pow ((piz1Durch /2) , 2.0));
        piz2flaeche = Math.PI * (Math.pow ((piz2Durch /2) , 2.0));


        if ((piz1flaeche / piz1Price) > (piz2flaeche / piz2Price)){
            System.out.println("Die Pizza mit " + piz1Durch + " cm hat ein besseres Größe-/Preisverhältnis");

        }else System.out.println("Die Pizza mit " + piz2Durch + " cm hat ein besseres Größe-/Preisverhältnis");


    }
}
