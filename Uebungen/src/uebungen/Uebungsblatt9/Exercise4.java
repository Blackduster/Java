package uebungen.Uebungsblatt9;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print(pot(2, 8));
        System.out.print(5);
        for (int i = 0; i < input; i++) {
            int a = 2;
        }
    }

    private static int pot(int base, int pot) {
        if (pot == 0) {
            return 1;
        } else {
            return base *= base;
        }
    }
}
