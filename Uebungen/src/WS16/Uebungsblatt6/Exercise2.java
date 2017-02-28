package WS16.Uebungsblatt6;
import java.util.Scanner;

/**
 * Created by awinter on 21.11.16.
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        boolean ungueltig = true;
        do {
            System.out.print("Geben Sie bitte eine Zahl ein: ");
            input = sc.nextInt();
            if (input >= 0 && input <= 1000000) {
                ungueltig = false;
                System.out.print(querprodukt(input));
            } else System.out.println("FEHLER - Zahl ist ungueltig.");

        } while (ungueltig);

    }

    public static int querprodukt(int input) {
        int summe = 1;
        while (input != 0) {
            summe *= input % 10;
            input = (int) (input / 10);
        }
        return summe;
    }

}
