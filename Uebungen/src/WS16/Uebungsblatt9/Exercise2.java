package WS16.Uebungsblatt9;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(spielen(input.toCharArray()));
    }

    private static String spielen(char[] chararray){
        String newString = "";
        for(int i = 0; i< chararray.length; i++){
            if (chararray[i] == 'a' || chararray[i] == 'e' || chararray[i] == 'i' || chararray[i] == 'o' || chararray[i] == 'u'){
                newString  += "" + chararray[i] + 'b' + chararray[i];
            }else{
                newString += chararray[i];
            }
        }
        return newString;
    }
}
