package uebungen.Uebungsblatt7;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}
