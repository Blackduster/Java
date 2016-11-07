package uebungen.Uebungsblatt4;
import java.util.Scanner;

/**
 * Created by awinter on 07.11.16.
 */
public class Aufgabe1 {

    public static void main(String[] args) {
        System.out.print("Bitte geben Sie Ihre Martrikelnummer ein: ");
        Scanner sc = new Scanner(System.in);

        int Martnr = sc.nextInt();
        if (Martnr >= 5000000 && Martnr < 5200000 || Martnr >= 6100000 && Martnr < 6200000)
            System.out.println("Martrikelnummer ist gültig");

        else System.out.println("Martrikelnummer stimmt nicht");

    }
}