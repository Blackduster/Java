package WS16.Sonstige.Kapitel8Aufgabe;

public class Main {
    public static void main(String[] args){

        Student test = new Student();
        Student chris = new Student("Christian", "Neuerer", 5223361);
        Student jonas = new Student("Jonas", "Burger", 5447781);
        Student achim = new Student("Achim", "Winter", 5116061);

        test.setMatrikelnummer(5845858);
        test.setNachname("testos");
        test.setVorname("testi");

        System.out.println("Vorname: " + achim.getVorname());

    }
}
