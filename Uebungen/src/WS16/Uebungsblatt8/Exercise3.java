package WS16.Uebungsblatt8;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0){
            System.out.println("Ungültigen Wert eingegeben");
            System.exit(0);
        }
        double[] Werte = new double[n];
        for (int i = 0; i < n; i++){
            System.out.print((i +1) + ". Wert: ");
            Werte[i] = sc.nextDouble();
        }
        System.out.println("Kleinster Wert: " + getMinValue(Werte));
        System.out.println("Größter Wert: " + getMaxValue(Werte));
        System.out.println("Arithmetischer Mittelwert: " + getAverage(Werte));
        System.out.println("Standardabweichung: " + extAverage((Werte), getAverage(Werte)));
    }
    private static double getMinValue(double[] Werte){
        double minvalue = Werte[0];
        for (int i = 0; i <= Werte.length; i++){
            if (i == Werte.length)
                return minvalue;
            if(minvalue > Werte[i]){
                minvalue = Werte[i];
            }
        }
        return minvalue;
    }

    private static double getMaxValue(double[] Werte){
        double maxvalue = Werte[0];
        for (int i = 0; i <= Werte.length; i++){
            if (i == Werte.length)
                return maxvalue;
            if(maxvalue < Werte[i]){
                maxvalue = Werte[i];
            }
        }
        return maxvalue;
    }
    private static double getAverage(double[] Werte){
        double average = Werte[0];
        for (int i = 1; i < Werte.length; i++) {
            average += Werte[i];
        }
        return (average / Werte.length);
    }

    private static double extAverage(double[] Werte, double average){
        double abweichung = 0;
        for(int i = 0; i < Werte.length; i++){
            abweichung += Math.pow(Werte[i] - average, 2);
        }
        return Math.sqrt(abweichung / Werte.length);
    }

}
