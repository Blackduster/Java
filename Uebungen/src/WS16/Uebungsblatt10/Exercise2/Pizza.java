package WS16.Uebungsblatt10.Exercise2;

public class Pizza {
    private String name;
    private int[] durchmesser;
    private double[] preis;

    public Pizza(String name, int[] durchmesser, double[] preis){
        this.name = name;
        this.durchmesser = durchmesser;
        this.preis = preis;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getDurchmesser() {
        return durchmesser;
    }

    public void setDurchmesser(int[] durchmesser) {
        this.durchmesser = durchmesser;
    }

    public double[] getPreis() {
        return preis;
    }

    public void setPreis(double[] preis) {
        this.preis = preis;
    }
}
