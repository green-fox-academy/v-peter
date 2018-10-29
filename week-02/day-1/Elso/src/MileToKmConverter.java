import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the distance in miles rounded.");
        int miles = sc.nextInt();
        double km = 1.609 * miles;
        System.out.printf("%.2f km", km);


    }
}
