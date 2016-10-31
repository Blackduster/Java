package uebungen.Uebungsblatt3;

/**
 * Created by awinter on 31.10.16.
 */
public class Aufgabe4 {
    public static void main(String[] args){
        double zufall = Math.ceil(6 * Math.random());


        switch((int) zufall){
            case 1: System.out.print("Eins gewürfelt");
                break;
            case 2: System.out.print("Zwei gewürfelt");
                break;
            case 3: System.out.print("Drei gewürfelt");
                break;
            case 4: System.out.print("Vier gewürfelt");
                break;
            case 5: System.out.print("Fünf gewürfelt");
                break;
            case 6: System.out.print("Sechs gewürfelt");
                break;

        }


    }
}
