package WS16.Uebungsblatt4;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Zeichen eingeben: ");
        char var1 = sc.nextLine().charAt(0);
        System.out.print("2. Zeichen eingeben: ");
        char var2 = sc.nextLine().charAt(0);
        boolean wrong = true;

        if (var1 == 'f' && var2 == 'f') {
            System.out.print(0);
            wrong = false;
        }
        if (var1 == 'f' && var2 == 't') {
            System.out.print(1);
            wrong = false;
        }
        if (var1 == 't' && var2 == 'f') {
            System.out.print(2);
            wrong = false;
        }
        if (var1 == 't' && var2 == 't') {
            System.out.print(3);
            wrong = false;
        }
        if (wrong == true) System.out.print("Ung\u00fcltige Eingabe");
    }
}
