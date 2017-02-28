package WS16.Uebungsblatt3;
import java.util.Scanner;

/**
 * Created by awinter on 31.10.16.
 */
public class Aufgabe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zeichen eingeben: ");
        char c = sc.nextLine().charAt(0);

        boolean bekannt = false;

        if(Character.isUpperCase(c)){
            System.out.println("Großbuchstabe");
            bekannt = true;
        }
        if (c >= 'A' && c <= 'F' || c >= 'a' && c <= 'f' || Character.isDigit(c)) {
            System.out.println("Hexadezimale Ziffer");
            bekannt = true;
        }

        if ( c <= '7' && c >= '0') {
            System.out.println("oktale Ziffer");
            bekannt = true;
        }

        if(c == '0' || c == '1'){
            System.out.println("binäre Ziffer");
            bekannt = true;
        }
        if(bekannt == false){
            System.out.println("Unbekannt");
        }
    }
}