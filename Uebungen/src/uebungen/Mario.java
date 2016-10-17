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

        for(int i=4; i<x+4;i++){

            for(int j=2; j<i ;j++){
                System.out.print("#");
            }
        System.out.println("");



        }





    }


}
