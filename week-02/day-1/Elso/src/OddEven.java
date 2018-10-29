import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer, please:");
        int n = sc.nextInt();

        if (n % 2 == 0) System.out.print("The number is even.");
        else System.out.print("The number is odd.");

    }
}
