package countletters;

import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

import static countletters.CountLetters.letterCounter;
import static org.junit.Assert.*;

public class CountLettersTest {
  TreeMap<Character, Integer> map = new TreeMap<>();

  @Test
  public void letterCounterTester() {
    String s = "Green Fox Academy";
    map.put('G', 1);
    map.put('r', 1);
    map.put('e', 3);
    map.put('n', 1);
    map.put('F', 1);
    map.put('o', 1);
    map.put('x', 1);
    map.put('A', 1);
    map.put('c', 1);
    map.put('a', 1);
    map.put('d', 1);
    map.put('m', 1);
    map.put('y', 1);
    map.put(' ', 2);
    assertEquals(map, letterCounter(s));
  }
}
