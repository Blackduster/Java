package uebungen.Uebungsblatt6;

/**
 * Created by awinter on 21.11.16.
 */
public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Fahrenheit" + "\tCelsius");
        for (int i = 0; i <= 300; i++) {
            System.out.println(i + "\t" + fahrentocels(i));


        }
    }


    public static double fahrentocels(int temp) {
        double celstemp = (5 / 9f) * (temp - 32);
        celstemp =  (int) (celstemp * 100);
        celstemp = celstemp / 100.0;
        return celstemp;
    }
}