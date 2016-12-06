package uebungen.Uebungsblatt8;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Basis ein: ");
        int base = sc.nextInt();
        System.out.print("Bitte geben Sie den Exponenten ein: ");
        int exp = sc.nextInt();

        System.out.println(recexp(base, exp));
    }
    private static int recexp(int base, int exp){
        if (exp == 0){
            return 1;
        }
        else {
            return base * recexp(base, (exp - 1));
        }
    }

}