import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        Scanner sc = new Scanner(System.in);
        System.out.print("Matrix size: ");
        int n = sc.nextInt();
        char c;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) c = '1';
                else c = '0';
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}