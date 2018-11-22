package fibonacci.test;

import fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci f;

  @Test
  public void fibonacciPositive() throws Exception{
    f = new Fibonacci();
    assertEquals(987, f.fibonacci(17));
  }

  @Test (expected = Exception.class)
  public void fibonacciZero() throws Exception{
    f = new Fibonacci();
    f.fibonacci(0);
  }

  @Test (expected = Exception.class)
  public void fibonacciNegative() throws Exception{
    f = new Fibonacci();
    f.fibonacci(-3);
  }

  @Test
  public void testExceptionMessage() {
    try {
      f = new Fibonacci();
      f.fibonacci(-3);
    } catch (Exception e) {
      assertEquals(e.getMessage(), "n must be positive" );
    }
  }

}
