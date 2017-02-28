package WS16.Sonstige.AlteKlausuren.WS1213;


public class TabletPC {
    public int DEFAULTTWERT = -1;
    public double DEFAULTGROESSE = -1.0;
    private String modell_ref;
    private int serienNummer;
    private double displayGroesse;
    private int akkuLaufzeit;

    TabletPC(String modell_ref, int serienNummer, double displayGroesse, int akkuLaufzeit) {
        this.modell_ref = modell_ref;
        if (serOK(serienNummer)) {
            this.serienNummer = serienNummer;
        } else {
            this.serienNummer = DEFAULTTWERT;
        }
        if (groesseOK(displayGroesse)) {
            this.displayGroesse = displayGroesse;
        } else {
            this.displayGroesse = DEFAULTGROESSE;
        }
        if (akkuOK(akkuLaufzeit)) {
            this.akkuLaufzeit = akkuLaufzeit;
        } else {
            this.akkuLaufzeit = DEFAULTTWERT;
        }
    }

    private static boolean serOK(int nummer) {
        boolean erg = true;
        if (nummer < 0) erg = false;
        if (nummer < 100000 || nummer > 999999) erg = false;
        return erg;
    }

    private static boolean groesseOK(double groesse) {
        boolean erg = true;
        if (groesse < 5.0) erg = false;
        if (groesse > 15.0) erg = false;
        return erg;
    }

    private static boolean akkuOK(int akku) {
        boolean erg = true;
        if (akku < 2) erg = false;
        if (akku > 20) erg = false;
        return erg;
    }

    public void setModellRef(String modell_ref) {
        this.modell_ref = modell_ref;
    }

    public String getModell_ref() {
        return this.modell_ref;
    }

    public int getSerienNummer() {
        return this.serienNummer;
    }

    public void setSerienNummer(int serienNummer) {
        if (serOK(serienNummer)) this.serienNummer = serienNummer;
    }

    public double getDisplayGroesseinZentimeter() {
        return this.displayGroesse * 2.54;
    }

    public double getDisplayGroesse() {
        return this.displayGroesse;
    }

    public void setDisplayGroesse(double displayGroesse) {
        if (groesseOK(displayGroesse)) this.displayGroesse = displayGroesse;
    }

    public int getAkkuLaufzeit() {
        return this.akkuLaufzeit;
    }

    public void setAkkuLaufzeit(int akkuLaufzeit) {
        if (akkuOK(akkuLaufzeit)) this.akkuLaufzeit = akkuLaufzeit;
    }

}
