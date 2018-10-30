import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First word");
        String a = sc.nextLine();
        System.out.println("Second word");
        String b = sc.nextLine();
        System.out.println(anagram(a,b));

    }

    public static boolean anagram(String a, String b){
        boolean c = true;
        for (int i = 0; i < a.length(); i++) {
            if (a.length() != b.length()) c = false;
            else if (a.charAt(i) != b.charAt(a.length()-1-i)) c = false;
        }

        return c;
    }


}