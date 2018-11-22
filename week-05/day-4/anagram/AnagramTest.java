package anagram;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AnagramTest {



  @Test
  public void isAnagram() {
    Anagram a = new Anagram("asdfghjk", "aksjdhfg");
    assertTrue(a.isAnagram());
  }
}
