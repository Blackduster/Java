package uebungen.Uebungsblatt2;

import java.util.Date;

/**
 * Created by awinter on 24.10.16.
 */
public class Ueb2_Aufgabe4 {

    public static void main(String[] args){

        Date date = new Date();
        int stunden = date.getHours();
        int minuten = date.getMinutes();
        int sekunden = date.getSeconds();

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
