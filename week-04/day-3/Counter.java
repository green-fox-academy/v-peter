public class Counter {
  public static void main(String[] args) {
    counter(5);
    System.out.println("recursive: ");
    recCounter(6);
  }

  public static void counter(int limit) {

    for (int i = 0; i < limit; i++) {
      System.out.println(i);
    }
  }

  public static void recCounter(int limit) {
    int i = 0;
    System.out.println(i);


//    System.out.println(limit);
//    if (limit > 0) {
//      recCounter(limit - 1);
//    }
//    if (limit == 0){
//      return;
//    }
//    recCounter(limit - 1);

  }

  public static void recCounter(int limit, int currentValue) {


  }

}
