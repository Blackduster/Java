package uebungen.Uebungsblatt5;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Untersuchende Zahl eingeben: ");
        int prim = sc.nextInt();
        boolean isprim = true;

        for (int i = 3; i <= prim/2; i += 2) {
            if (prim % i == 0) isprim = false;
        }

        if (isprim == true)System.out.print("Untersuchte Zahl ist eine Primzahl");
        else System.out.print("Untersuchte Zahl ist keine Primzahl");
    }
}
