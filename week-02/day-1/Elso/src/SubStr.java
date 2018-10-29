import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string, please:");
        String input = sc.nextLine();
        System.out.println("Enter the second string, please:");
        String q = sc.nextLine();
        System.out.println(SubStr(input, q));
    }

    public static int SubStr(String input, String q) {

        if (input.contains(q))
            return input.indexOf(q);
        return -1;
    }
}
