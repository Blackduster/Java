package uebungen.Uebungsblatt10.Exercise2;

public class Pizza {
    private String name;
    private int[] durchmesser;
    private double[] preis;

    public Pizza(String name, int[] durchmesser, double[] preis){
        this.name = name;
        for (int i = 0; i<=durchmesser.length;i++){
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
        for(int i = 0; i <= durchmesser.length; i++){
            this.durchmesser[i] = durchmesser[i];
        }

    }

    public double[] getPreis() {
        return preis[];
    }

    public void setPreis(double[] preis) {
        for(int i = 0; i <= preis.length; i++){
            this.preis[i] = preis[i];
        }
    }
}
