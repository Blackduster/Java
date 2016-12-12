package uebungen.Uebungsblatt9;


public class Exercise1 {
    public static void main(String[] args) {
        int[] lottozahlen = new int[6];
        outer:
        for (int i = 0; i < lottozahlen.length; i++) {
            int gezogeneZahl = (int) ((49 * Math.random())+1);
            if (numberAlreadyIncluded(lottozahlen, gezogeneZahl)){
                i--;
                continue outer;
            }

            lottozahlen[i] = gezogeneZahl;
        }
        sort(lottozahlen);
        for (int g = 0; g < lottozahlen.length; g++) {
            System.out.println(lottozahlen[g]);
        }
    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    private static Boolean numberAlreadyIncluded(int[] array, int number) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number) {
                return true;
            }
        }
        return false;
    }
}
