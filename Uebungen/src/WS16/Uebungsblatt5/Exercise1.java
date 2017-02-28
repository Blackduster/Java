package WS16.Uebungsblatt5;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException {
        //Aufgabe a)
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Fallzeit eingeben: ");
        int Falltime = sc.nextInt();
        double g = 9.80665;

        for (int i = 1; i<=Falltime; i++){
            Thread.sleep(1000);
            System.out.println(0.5 * g * (Math.pow(i , 2)));
        }
    }
}
