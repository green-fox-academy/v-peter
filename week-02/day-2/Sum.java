import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("What's the number?");
        int n = sc.nextInt();
        System.out.print(sum(n));
    }

    private static int sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
