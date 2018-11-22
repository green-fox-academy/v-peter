package sum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
  Sum s;
  ArrayList<Integer> list;

  @BeforeEach
  void setUp() {
    s = new Sum();

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void sumEmptyList() {
    list = new ArrayList<>();
    assertEquals(0, s.sum(list));
  }

  @Test
  void sumOneElement() {
    list = new ArrayList<>();
    list.addAll(Arrays.asList(2));
    assertEquals(2, s.sum(list));
  }
  @Test
  void sumMultipleElements() {
    list = new ArrayList<>();
    list.addAll(Arrays.asList(1, 2, 3, 4, 5));
    assertEquals(15, s.sum(list));
  }

  @Test
  void sumNull() {
    Throwable exception = assertThrows(NullPointerException.class, () -> {
      throw new NullPointerException("a message");
    });
    assertEquals("a message", exception.getMessage());
  }
}
