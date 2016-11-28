package uebungen.Uebungsblatt7;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Zahl eingeben, die gerundet werden soll: ");
        double input = sc.nextDouble();
        System.out.print("Bitte Zahl eingeben, wie viele Stellen nach dem Komma sollen angezeigt werden? ");
        int dec = sc.nextInt();
        System.out.print(roundfloat(input, dec));
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

    private static double roundfloat(double number, int prec) {
        int pow = 1;
        for (int i = 1; i <= prec; i++) {
            pow *= 10;
        }
        number *= pow;
        number = (int) (number);
        return number / pow;
    }
}

