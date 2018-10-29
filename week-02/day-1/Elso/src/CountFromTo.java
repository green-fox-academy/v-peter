import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number, please:");
        int a = sc.nextInt();
        System.out.println("Enter the second number, please:");
        int b = sc.nextInt();

        if (b<=a) System.out.println("The second number should be bigger");
        else{
            for (int i = a; i< b; i++){
                System.out.println(i);
            }
        }


    }
}
