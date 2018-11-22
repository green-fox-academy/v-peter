package extension;

import java.util.Arrays;
import java.util.List;


public class Extension {
  public int add(int a, int b) {
    return a + b;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) return a;
      else return c;
    } else if (a > c) {
      return b;
    } else if (b > c) return b;
    return c;
  }

  public double median(List<Integer> pool) {
   double sum = 0;
    for (int n :
        pool) {
      sum += n;
    }
    return (double)Math.round((sum / pool.size()) * 100d) / 100d;
  }

  public boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }

  public static void main(String[] args) {
    Extension e = new Extension();
    System.out.println(e.median(Arrays.asList(1,2,3,214,51,6,7)));
  }

}
