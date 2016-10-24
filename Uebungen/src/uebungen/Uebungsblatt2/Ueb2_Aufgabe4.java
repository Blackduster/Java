package uebungen.Uebungsblatt2;
import java.util.Calendar;

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

        /*
        SimpleDateFormat std = new SimpleDateFormat("HH");
        String StrsStunden = std.format(new Date());
        int stunden = Integer.parseInt(StrsStunden);

        Date
        //a
        System.out.println("Sekunden seit Mitternacht: " + stunden*60*60);
        //b
        SimpleDateFormat all = new SimpleDateFormat("HH.mm.ss");
        System.out.print(all);
        */

    }

}
