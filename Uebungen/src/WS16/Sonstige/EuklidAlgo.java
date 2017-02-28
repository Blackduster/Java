package WS16.Sonstige;
import java.util.Scanner;

public class EuklidAlgo {
    private static Scanner sc;
    public static void main(String[] args) {
        int a, b, r;
        sc = new Scanner(System.in);
        System.out.print("Bitte eine Zahl A eingeben: ");
        a = sc.nextInt();
        System.out.print("Bitte eine Zahl B eingeben: ");
        b = sc.nextInt();
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("Der ggT lautet " + a);
    }

}
