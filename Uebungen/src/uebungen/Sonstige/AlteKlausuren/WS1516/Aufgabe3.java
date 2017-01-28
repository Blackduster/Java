package uebungen.Sonstige.AlteKlausuren.WS1516;

/**
 * Created by Achim on 28.01.2017.
 */
public class Aufgabe3 {
    private int number;
    private boolean lock;

    public Aufgabe3(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getLock() {
        return this.lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        if (this.lock == false)
            return "o";
        else return "z";

    }
}
