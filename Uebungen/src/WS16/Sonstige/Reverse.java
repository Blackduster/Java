package WS16.Sonstige;
import java.util.Scanner;

/**
 * Created by awinter on 20.10.16.
 */
public class Reverse {

    private static Scanner sc;

    public static void main(String[] args){

        System.out.print("Zahl eingeben: ");
        sc = new Scanner(System.in);
        int a =0;
        a = sc.nextInt();
        while(a != 0){
            System.out.print(a % 10);
            a = a - (a % 10 );
            a = a /10;
        }

    }
}
