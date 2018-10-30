import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintParams {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String s;
//        List<String> l = new ArrayList<>();
//        do {
//            System.out.println("Type a string, please (if ends, type nothing)");
//            s = sc.nextLine();
//            l.add(s);
//        } while (!s.isEmpty());
//
//        String[] t = new String[l.size()];
//        t = l.toArray(t);
//
//        printParams(t);
        printMoreParams("alma", "korte");
    }

//    private static void printParams(String[] s) {
//        System.out.println(Arrays.toString(s));
//    }

    private static void printMoreParams(String... s) {
        for (String t: s) {
            System.out.println(t);
        }
        System.out.println(Arrays.toString(s));
    }


}
