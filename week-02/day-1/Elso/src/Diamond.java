import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i < (n + 1) / 2)
                for (int j = 0; j < n; j++) {
                    if (j < (n - 1) / 2 - i) {
                        System.out.print(" ");
                    }
                    else if (j <= n / 2 + i) System.out.print("*");
                    else System.out.print(" ");
                }
            else {
                for (int j = 0; j < n; j++) {
                    if (j < i - n / 2) {
                        System.out.print(" ");
                    }
                    else if (j < n - i + n / 2) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}