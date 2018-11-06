import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking {
    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));

    }

    static List<String> makingMatches (ArrayList<String> a, ArrayList<String> b){
        ArrayList<String> w = new ArrayList<>();
                w.addAll(a);
        for (int i = 0; i < a.size(); i++) {
            w.add(1 + 2*i, b.get(i));
        }
        return w;
    }



}