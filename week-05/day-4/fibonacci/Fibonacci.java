package fibonacci;

public class Fibonacci {
  public int fibonacci(int n) throws Exception{
    if (n <= 0) throw new Exception("n must be positive");
    else {

      if (n == 1)
        return 0;
      else if (n == 2)
        return 1;
      else
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    try {
      System.out.println(f.fibonacci(3));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
