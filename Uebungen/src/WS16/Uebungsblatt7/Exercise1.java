package WS16.Uebungsblatt7;
import java.util.Scanner;
/**
 * Created by awinter on 28.11.16.
 */
public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        double summe = 0;

        for (int i=0; i < repeat;i++){
            summe = summe + ((Math.pow(-1, i)) / (2*i +1));
        }
        System.out.print(summe * 4);
    }
}
