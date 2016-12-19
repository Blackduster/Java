package uebungen.Uebungsblatt10.Exercise2;

public class Pizza {
    private int anzahl;
    private String name;
    private int[] durchmesser = new int[anzahl];
    private double[] preis = new double[anzahl];

    public Pizza(int anzahl, String name, int[] durchmesser, double[] preis){
        this.anzahl = anzahl;
        this.name = name;
        for (int i = 0; i<=this.anzahl;i++){
            this.durchmesser[i] = durchmesser[i];
            this.preis[i] = preis[i];
        }

    }

    public String setName(String name){
        return this.name;
    }
    public void getName(){
        this.name = name;
    }

    public int[] getDurchmesser() {
        return durchmesser[];
    }

    public void setDurchmesser(int[] durchmesser) {
        for(int i = 0; i <= this.anzahl; i++){
            this.durchmesser[i] = durchmesser[i];
        }

    }

    public double[] getPreis() {
        return preis[];
    }

    public void setPreis(double[] preis) {
        for(int i = 0; i <= this.anzahl; i++){
            this.preis[i] = preis[i];
        }
    }
}
