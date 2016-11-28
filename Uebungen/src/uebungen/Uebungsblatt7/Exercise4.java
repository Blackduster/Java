package uebungen.Uebungsblatt7;

import java.util.Scanner;

public class Exercise4 {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = input / 2; i > 0; i = i - 2) {
            System.out.print(" ");
        }
        for (int j = 1; j <= input; j++) {
            System.out.print("*");
        }
        for (int k = input / 2; k > 0; k = k - 2) {
            System.out.print(" ");
        }

    }
}
