public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumDigit(123454321));
  }

  public static int sumDigit(int n) {
    if ((n / 10) == 0) {
      return n;
    } else {
      return n % 10 + sumDigit(n / 10);
    }
  }
}