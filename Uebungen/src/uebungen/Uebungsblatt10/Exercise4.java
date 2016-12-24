package uebungen.Uebungsblatt10;

public class Exercise4 {
    public static void main(String[] args) {
        double summe = 0;
        if (args[args.length - 1].equals("+")) {
            for (int i = 0; i < args.length - 1; i++) {
                summe += Integer.parseInt(args[i]);
            }
        } else {
            summe = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length - 1; i++) {
                summe -= Integer.parseInt(args[i]);
            }
        }
        System.out.println(summe);
    }
}
