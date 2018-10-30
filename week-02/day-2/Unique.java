import java.util.Arrays;
import java.util.stream.IntStream;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    static String unique(int[] n) {
    //AZ UJ TOMB ELEMSZAMA

        //lemasolom az eredeti tombot
        int[] o = n.clone();
        // bevezetek egy szamlalot az ismetlodesekre
        int count = 0;
        //a tomb minden elemét vizsgalom minden elemével (tombhossz x tombhossz)
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (o[j] == n[i]) {
                    count++;
                    //ha megtalalja az elso ismetlodest, rogton kilep a kovetkezo beture
                    if (count == 2) break;
                }
            }
        }
        // a letrehozando uj tomb hosszat hatarozom meg a duplikaciok szamabol és az eredeti tomb hosszabol
        int diff = (count - n.length) / 2;
        //letrehozom az uj p tombot
        int[] p = new int[n.length - diff];




        System.out.println(diff);
        String f = "nemjo";
        return f;
//        int[] noDuplicates = IntStream.of(n).distinct().toArray();
//        return Arrays.toString(noDuplicates);
    }

}