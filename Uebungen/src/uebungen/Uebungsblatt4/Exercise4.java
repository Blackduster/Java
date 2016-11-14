package uebungen.Uebungsblatt4;
import java.util.Scanner;

/**
 * Created by awinter on 07.11.16.
 */
public class Exercise4 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte eine Jahreszahl eingeben ");
        int year = sc.nextInt();
        boolean istJahr=false;
        if (year % 4 == 0){

            if (year % 100 == 0 ) {
                if (year % 400 == 0) {
                    System.out.print(year + " ist ein Schaltjahr");
                    istJahr = true;
                }
                else  {
                    istJahr = true;
                    System.out.println (year + " ist kein Schaltjahr");
                }
            }
            if (istJahr == false) System.out.println(year + " ist ein Schaltjahr");
            //ewwwwwwww
        }else System.out.print(year + " ist kein Schaltjahr");

    }
}
