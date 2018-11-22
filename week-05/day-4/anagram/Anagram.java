package anagram;

public class Anagram {
  String s1;
  String s2;

  public Anagram(String s1, String s2) {
    this.s1 = s1;
    this.s2 = s2;
  }

  public boolean isAnagram() {
    if (s1.length() != s2.length()) return false;
    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      if (!(s2.contains(c1 + "") && s1.contains(c2 + ""))) return false;
    }
    for (char c :
        s1.toCharArray()) {
      if (countChar(c, s1) != countChar(c, s2)) return false;
    }
    return true;
  }

  public static  int countChar(char c, String s) {
    int sum = 0;
    for (char actualChar :
        s.toCharArray()) {
      if (c == actualChar) sum++;
    }
    return sum;
  }


}
