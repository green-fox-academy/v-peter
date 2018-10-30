import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

        String[] s = {"koal", "pand", "zebr"};
        for (int i = 0; i < s.length; i++){
            s[i]+='a';
        }
        System.out.println(Arrays.toString(s));

    }
}