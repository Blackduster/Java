package WS16.Uebungsblatt4;
import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Stunden ein: ");
        int hours = sc.nextInt();
        System.out.print("Bitte geben Sie die Minuten ein: ");
        int minutes = sc.nextInt();
        System.out.print("Bitte geben Sie die Sekunden ein: ");
        int seconds = sc.nextInt();
        if (hours <= 23 && hours >= 00 && minutes <= 59 && minutes >=00 && seconds >=00 && seconds <= 59){
            System.out.print("Die Uhrzeit ist g\u00fcltig");
        }else System.out.print("Die Uhrzeit ist ung\u00fcltig");
    }
}
