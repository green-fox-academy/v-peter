public class Bunny1 {
  public static void main(String[] args) {
    System.out.println(earCounter(13));

  }

  public static int earCounter(int n) {
    if (n == 1) return 2;
    return 2 + earCounter(n - 1);
  }


}