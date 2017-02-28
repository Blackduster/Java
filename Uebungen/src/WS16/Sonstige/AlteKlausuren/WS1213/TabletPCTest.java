package WS16.Sonstige.AlteKlausuren.WS1213;

/**
 * Created by Achim on 02.01.2017.
 */
public class TabletPCTest {
    public static void main(String[] args) {
        TabletPC[] samsapple_ref = new TabletPC[500];
        int seriennummer = 100000;
        for (int i = 0; i < samsapple_ref.length; i++) {
            samsapple_ref[i] = new TabletPC("MILKYWAY", seriennummer, 10.0, 8);
            seriennummer += 2;
        }
    }
}
