package extension.test;


import extension.Extension;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
public class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_3and3is5() {
    assertEquals(6, extension.add(3, 3));
  }

  @Test
  void testAdd_5and4is5() {
    assertEquals(9, extension.add(5, 4));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(7, extension.maxOfThree(7, 6, -1));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(10, extension.median(Arrays.asList(17,15,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}
