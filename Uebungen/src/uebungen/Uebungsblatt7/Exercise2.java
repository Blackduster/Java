package uebungen.Uebungsblatt7;
import java.util.Scanner;

/**
 * Created by awinter on 28.11.16.
 */
public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.print(round(input));



    }

    private static int round(double number){
        double nachkomma = number - (int)number;
        if (nachkomma < 0.5){
            return (int)number;
        }
        else{
            number += 0.5;
            return (int) number;
        }
    }

    private static float roundfloat(double number, int prec){
//


    }
}

