import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Range starting number: ");
        int start = sc.nextInt();
        System.out.print("Range ending number: ");
        int end = sc.nextInt();
        Random r = new Random();
        int n = r.nextInt(end - start + 1) + start;
        System.out.print("Number of lives: ");
        int lives = sc.nextInt();
        System.out.println("I've the number between " + start + "-" + end + ". You have " + lives + " lives.");
        boolean won = false;
        do {
            System.out.println("Guess a number: ");
            lives--;
            int g = sc.nextInt();
            if (lives > 0) {
                if (g > n) System.out.println("Too high. You have " + lives + " lives left.");
                if (g < n) System.out.println("Too low. You have " + lives + " lives left.");
                if (g == n) {
                    System.out.println("Congratulations. You won!");
                    won = true;
                }
            } else System.out.println("You lose.");
        } while (lives > 0 && !won);
    }
}