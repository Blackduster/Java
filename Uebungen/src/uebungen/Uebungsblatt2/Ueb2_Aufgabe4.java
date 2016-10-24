package uebungen.Uebungsblatt2;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by awinter on 24.10.16.
 */
public class Ueb2_Aufgabe4 {

    public static void main(String[] args){

        Calendar cal = Calendar.getInstance();
        int stunden = cal.get(Calendar.HOUR_OF_DAY);
        int minuten = cal.get(Calendar.MINUTE);
        int sekunden = cal.get(Calendar.SECOND);


        //a
        int seknow = (stunden * 60 * 60) + (minuten *60) + sekunden;
        System.out.println("Sekunden seit Mitternacht: " + seknow);

        //b
        int maxsek = 24 * 60 * 60;
        System.out.println("Verbleibende Sekunden: " + (maxsek - seknow));

        //c
        System.out.println("Prozent vergangen: " + ((seknow * 100.0) / maxsek ));
    }

}
