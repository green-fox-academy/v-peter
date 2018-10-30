import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] n = {3, 4, 5, 6, 7};
        for (int i = 0; i < n.length; i++) {
            n[i] *= 2;
        }
        System.out.println(Arrays.toString(n));

    }
}