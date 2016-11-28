package uebungen.Uebungsblatt7;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int summe = 1;

        for (int i = input; i > 0; i--) {
            summe *= i;
        }
        System.out.println(summe);
    }
}
