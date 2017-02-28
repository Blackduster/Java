package WS16.Uebungsblatt10.Exercise2;

public class Main {
    public static void main(String[] args){

        int[] durchmesser = {26, 32, 50};
        double[] preis = {5.50, 7.00, 10.00};

        Pizza hawaii = new Pizza("Pizza Hawaii", durchmesser, preis);

        durchmesser = new int[]{15, 30, 45};
        preis = new double[]{5.00, 6.50, 9.00};

        Pizza salami = new Pizza("Pizza Salami", durchmesser, preis);

        durchmesser = new int[]{15, 30, 45, 60};
        preis = new double[]{5.00, 6.50, 9.00, 12.00};

        Pizza tuna = new Pizza("Pizza Tuna", durchmesser, preis);

        durchmesser = new int[]{15, 30};
        preis = new double[]{5.00, 6.50};

        Pizza speciale = new Pizza("Pizza Speciale", durchmesser, preis);

        durchmesser = new int[]{15, 30, 45, 60};
        preis = new double[]{3.00, 5.00, 6.50, 9.00};

        Pizza margherita = new Pizza("Pizza Margherita", durchmesser, preis);

    }
}
