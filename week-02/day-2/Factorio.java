import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the number?");
        int n = sc.nextInt();
        System.out.print(factorio(n));
    }

    private static int factorio(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }


}
