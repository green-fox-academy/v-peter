package countletters;

import anagram.Anagram;

import java.util.HashMap;
import java.util.TreeMap;

public class CountLetters {


  public static TreeMap<Character, Integer> letterCounter(String s) {
    TreeMap<Character, Integer> map = new TreeMap<>();

    for (char c :
        s.toCharArray()) {
      map.put(c, Anagram.countChar(c, s));
    }
    return map;

  }

}
