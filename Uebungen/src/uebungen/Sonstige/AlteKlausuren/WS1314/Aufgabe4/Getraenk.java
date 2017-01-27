package uebungen.Sonstige.AlteKlausuren.WS1314.Aufgabe4;

/**
 * Created by Achim on 27.01.2017.
 */
public class Getraenk {
    final double DEFAULTWERT = -1.0;
    private String name;
    private double menge;
    private double preis;

    public Getraenk(String name, double menge, double preis) {
        this.name = name;
        if (menge > 0 && menge < 1) {
            this.menge = menge;
        } else this.menge = DEFAULTWERT;
        if (preis < 1 || preis > 8) {
            this.preis = DEFAULTWERT;
        } else this.preis = preis;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMenge() {
        return this.menge;
    }

    public void setMenge(double menge) {
        if (menge <= 0 || menge > 1)
            System.out.println("");
        else this.menge = menge;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        if (preis >= 1 && preis <= 8)
            this.preis = preis;
    }

    @Override
    public String toString() {
        return "Getränk: " + this.name + "\n Menge: " + this.menge + "\n Preis: " + this.preis + "€";
    }
}
