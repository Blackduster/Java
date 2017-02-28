package WS16.Bonusblatt;

public class Exercise1 {
    public static void main(String[] args){
        short zahl = -3;
        System.out.println(betrag(zahl));

    }
    private static int betrag(int zahl){
        if(zahl<0){
            return zahl * -1;
        }else{
            return zahl;
        }
    }

    private static float betrag(float zahl){
        if(zahl<0){
            return zahl * -1;
        }else{
            return zahl;
        }
    }
    private static double betrag(double zahl){
        if(zahl<0){
            return zahl * -1;
        }else{
            return zahl;
        }
    }
    private static short betrag(short zahl){
        if(zahl<0){
            return (short) (zahl * -1);
        }else{
            return zahl;
        }
    }
    private static long betrag(long zahl){
        if(zahl<0){
            return zahl * -1;
        }else{
            return zahl;
        }
    }


}
