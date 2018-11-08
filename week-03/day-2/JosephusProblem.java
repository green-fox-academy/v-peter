import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of soldiers: ");
        int s = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i < s + 1; i++) {
            l.add(i);
        }
        do {
            for (int i = 0; i <= l.size() - 1; i++) {
                if (i == l.size()-1) l.remove(0);
                else l.remove(i + 1);
            }
        } while (l.size() > 1);
        System.out.println("The winning place: "+l.get(0));
    }
}