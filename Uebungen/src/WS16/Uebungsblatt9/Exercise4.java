package WS16.Uebungsblatt9;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.println(sin(input));
    }

    private static double sin(double x){
        double summand = 0;
        double summe = 0;
        int vorzeichen = 1;
        double zaehler = 0;
        double nenner = 0;
        for (int i=3; i < 20; i = i+2){
            zaehler = vorzeichen * pot(x, i);
            nenner = fac(i);
            summand = zaehler / nenner;
            summe = summe + summand;
            vorzeichen *= -1;
        }
        return x-summe;
    }

    private static double pot(double base, int pot) {
        if(pot==0){
            return 1;
        }else{
            return base * pot(base, pot-1);
        }
    }

    private static long fac(int zahl){
        if(zahl == 0) {
            return 1;
        }else{
            return zahl * fac(zahl-1);
        }
    }

}
