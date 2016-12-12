package uebungen.Sonstige;
import java.util.Scanner;

public class expEuklidAlgo {
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte eine Zahl für A eingeben: ");
        int a = sc.nextInt();
        System.out.print("Bitte eine Zahl für B eingeben: ");
        int b = sc.nextInt();
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
    }
}
