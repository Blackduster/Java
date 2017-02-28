package WS16.Uebungsblatt9;

public class Exercise3{
    public static void main(String[] args){
        if (args.length == 2){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a * b);
        }else{
            System.out.println("Es wurde eine falsche Anzahl von Parametern übergeben");

        }

    }
}
