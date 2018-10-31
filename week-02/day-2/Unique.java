import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Unique {

    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Type the " + i + ". number, please");
            int o = sc.nextInt();
            array[i] = o;
        }
        //int[] test = {1, 2, 3, 4, 5, 2, 5, 9, 8, 7};
        System.out.println(unique(array));
        //System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    static String unique(int[] array) {

        //AZ UJ TOMB ELEMSZAMANAK MEGALLAPITASA
        // bevezetek egy szamlalot az ismetlodesekre
        int count = 0;
        //a tomb minden elemét vizsgalom minden elemével
        for (int i = 0; i < array.length; i++) {
            int iteration = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && i < j) {
                    iteration++;
                }
            }
            //ha legalább egyszer ismétlődik:
            if (iteration > 0) count++;
        }
        // az uj tomb hosszat hatarozom meg a duplikaciok szamabol és az eredeti tomb hosszabol
        int newLength = array.length - count;
        //letrehozom az uj p tombot
        int[] p = new int[newLength];

        //AZ UJ TOMB FELTOLTESE
        //az uj tomb elso eleme
        int k = 0;
        //léptetem az eredeti tömböt
        for (int i = 0; i < array.length; i++) {
            // egyedi-e a szám ? számolom a duplikációkat
            int newCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && i < j)
                    newCount++;
            }
            if (newCount == 0) {
                //beirom a tombbe
                p[k] = array[i];
                //léptetem az uj tömbindexet
                k++;
            }
        }
        return Arrays.toString(p);
    }
}