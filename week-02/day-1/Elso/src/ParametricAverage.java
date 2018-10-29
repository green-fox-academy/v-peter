import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the numbers, please:");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++){
            System.out.println("Enter a number, please:");
            int b = sc.nextInt();
            sum += b;
        }


        System.out.println("Sum: "+sum+", Average: "+sum/a);

    }
}
