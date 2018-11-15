public class Counter {
  public static void main(String[] args) {
    recCounter(6);
  }

  public static void recCounter(int number) {
    System.out.println(number);
    if (number > 0) {
      recCounter(--number);
    }
  }
}
