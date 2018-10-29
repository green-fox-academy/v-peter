import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, please:");
        int a = sc.nextInt();
        int b;
        do {
            System.out.println("Enter the guess, please:");
            b = sc.nextInt();
            if (b < a) System.out.println("The stored number is higher");
            else if (b > a) System.out.println("The stored number is higher");
            else System.out.println("You found the number: "+b);
        } while (a != b);


    }
}
