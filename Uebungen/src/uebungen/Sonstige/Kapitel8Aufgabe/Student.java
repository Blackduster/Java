package uebungen.Sonstige.Kapitel8Aufgabe;

public class Student {

    private String vorname;
    private String nachname;
    private int matrikelnummer;

    public Student(){

    }


    public Student(String vorname, String nachname, int matrikelnummer){
     this.vorname = vorname;
     this.nachname = nachname;
     this.matrikelnummer = matrikelnummer;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }
    public String getVorname(){
        return this.vorname;
    }
    public void setNachname(String nachname){
        this.nachname = nachname;
    }
    public String getNachname(){
        return this.nachname;
    }
    public void setMatrikelnummer(int matrikelnummer){
        this.matrikelnummer = matrikelnummer;
    }
    public int getMatrikelnummer(){
        return matrikelnummer;
    }
}
