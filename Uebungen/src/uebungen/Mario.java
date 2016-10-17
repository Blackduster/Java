package uebungen;
import java.util.Scanner;
/**
 * Created by Achim on 17.10.2016.
 */
public class Mario {

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);
        int x;
        System.out.print("Bitte eingeben, wie viele Reihen sie möchten: ");
        x = sc.nextInt();

        for(int i=2; i<x+2;i++){
            for(int k=x+2;k>i;k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
            System.out.print("#");
            }

        System.out.println("");

        }

    }

}
