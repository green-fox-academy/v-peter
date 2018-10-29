import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of girls:");
        int a = sc.nextInt();
        System.out.println("Number of boys:");
        int b = sc.nextInt();
        if (a == 0) System.out.println("Sausage party");
        else if (a + b >= 20 && a == b) System.out.println("The party is excellent!");
        else if (a + b >= 20 && a != b) System.out.println("Quite cool party!");
        else System.out.println("Average party...");


    }

}
