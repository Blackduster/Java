package WS16.Sonstige;

/**
 * Created by Achim on 02.11.2016.
 */
public class Primzahlen {

    public static void main(String[] args){
            double biswieviel, von;
            double i, n;
            new Thread3().start();
            new Thread2().start();
            new Thread4().start();

            von = 1;
            biswieviel = 250000000;

            for (i = von; i <= biswieviel; i++) {
                n = 2;

                while (i % n != 0 && n <= i / 2) {
                    n = n + 1;
                }

                if (n >= i / 2 + 1 && i != 1) {
                    System.out.println(i);
                }

            }
        }
    public static class Thread2 extends Thread{
        public void run(){

        int biswieviel2, von2;
        int i, n;

        von2 = 250000001;
        biswieviel2 = 500000000;

            for (i = von2; i <= biswieviel2; i++) {
            n = 2;

            while (i % n != 0 && n <= i / 2) {
                n = n + 1;
            }

            if (n >= i / 2 + 1 && i != 1) {
                System.out.println(i);
            }

        }
        }

    }

    public static class Thread3 extends Thread{
        public void run(){

            int biswieviel2, von2;
            int i, n;

            von2 = 500000001;
            biswieviel2 = 750000000;

            for (i = von2; i <= biswieviel2; i++) {
                n = 2;

                while (i % n != 0 && n <= i / 2) {
                    n = n + 1;
                }

                if (n >= i / 2 + 1 && i != 1) {
                    System.out.println(i);
                }

            }
        }

    }
    public static class Thread4 extends Thread{
        public void run(){

            int biswieviel2, von2;
            int i, n;

            von2 = 750000001;
            biswieviel2 = 1000000000;

            for (i = von2; i <= biswieviel2; i++) {
                n = 2;

                while (i % n != 0 && n <= i / 2) {
                    n = n + 1;
                }

                if (n >= i / 2 + 1 && i != 1) {
                    System.out.println(i);
                }

            }
        }

    }
    }

