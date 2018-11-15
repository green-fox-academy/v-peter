public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(earCounter(5));
  }
  public static int earCounter(int n) {
    int ears;
    if (n % 2 == 0) ears = 3;
    else ears = 2;
    if (n == 1) return ears;
    return ears + earCounter(n - 1);
  }
}