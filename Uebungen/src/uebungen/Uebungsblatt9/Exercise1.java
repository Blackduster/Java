package uebungen.Uebungsblatt9;


public class Exercise1 {
    public static void main(String[] args) {
        int[] array = new int[6];
        outer:
        for (int i = 0; i < array.length;) {
            int a = (int) ((49 * Math.random())+1);
            for (int j = 0; j < i; j++) {
                if (array[j] == a) {
                    continue outer;
                }
            }
            array[i] = a;
            i++;
        }
        array = sort(array);
        for (int g = 0; g < array.length; g++) {
            System.out.println(array[g]);
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
}
