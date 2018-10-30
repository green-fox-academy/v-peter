import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintParams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        List<String> l = new ArrayList<>();
        do {
            System.out.println("Type a string, please");
            s = sc.nextLine();
            l.add(s);
        } while (s != "");

        printParams((String[]) l.toArray());
    }

    private static void printParams(String[] s) {
        System.out.println(s);
    }
}
