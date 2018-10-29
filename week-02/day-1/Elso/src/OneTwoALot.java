import java.util.Scanner;

public class OneTwoALot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, please.");
        int n = sc.nextInt();
        switch (n) {
            case 1: System.out.println("One");
            break;
            case 2:
                System.out.println("Two");
        }
        if (n<1) System.out.println("Not enough");
        else if(n>2) System.out.println("A lot");

    }
}
