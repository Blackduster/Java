package WS16.Uebungsblatt10.Exercise1;

import java.util.Arrays;

/**
 * Created by awinter on 19.12.16.
 */
public class Main {

  public static void main(String[] args) {
    Auto chriscar = new Auto("blub", 1000, "esexistiertnicht", 2050);
    Auto jonascar = new Auto("Renault", 1400, "weiss", 2004);
    Auto mycar = new Auto("Audi", 4200, "blau", 1997);

    int[] hubraumlist = new int[3];
    hubraumlist[0] = chriscar.getHubraum();
    hubraumlist[1] = jonascar.getHubraum();
    hubraumlist[2] = mycar.getHubraum();

    int max = Arrays.stream(hubraumlist).max().getAsInt();
    System.out.println(max);
  }
}
