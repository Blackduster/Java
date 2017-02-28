package WS16.Uebungsblatt10.Exercise1;

public class Auto {

    private String marke;
    private int hubraum;
    private String farbe;
    private int baujahr;

    public Auto(String marke, int hubraum, String farbe, int baujahr){
        this.marke = marke;
        this.farbe = farbe;
        this.baujahr = baujahr;
        if(hubraum<=0){
            this.hubraum = 1600;
        }else this.hubraum = hubraum;

    }

    public void setMarke(String marke){
        this.marke = marke;
    }
    public String getMarke(){
        return this.marke;
    }
    public void setHubraum(int hubraum){
        if(hubraum<=0){

        }else{
            this.hubraum = hubraum;
        }
    }
    public int getHubraum(){
        return this.hubraum;
    }
    public void setFarbe(String farbe){
        this.farbe = farbe;
    }
    public String getFarbe(){
        return this.farbe;
    }
    public void setBaujahr(int baujahr){
        this.baujahr = baujahr;
    }
    public int getBaujahr(){
        return this.baujahr;
    }
}
