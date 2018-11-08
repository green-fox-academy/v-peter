import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number pls: ");
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        int q = n;
        while (q >= 10) {
            l.add(q % 10);
            q /= 10;
        } l.add(q);
        int sum = 0;
        int p = l.size();
        for (int i = 0; i < l.size(); i++) {
            int o =  l.get(i);
            sum += Math.pow((double) o, p);
        }
        if (n == sum) System.out.print("The "+n+" is an Armstrong number.");
        else System.out.print("The "+n+" is not an Armstrong number.");
    }
}