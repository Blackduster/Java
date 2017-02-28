package WS16.Uebungsblatt3;
import java.util.Scanner;
/**
 * Created by awinter on 31.10.16.
 * Modulo
 */
public class Aufgabe1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte eine Zahl eingeben: ");
        int x = sc.nextInt();
        if ((x % 7) == 0){
            System.out.println("\nZahl ist ohne Rest durch 7 teilbar");
        }else System.out.println("\nZahl ist nicht ohne Rest durch 7 teilbar");
    }
}