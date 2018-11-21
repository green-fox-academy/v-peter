package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String s;

  public Gnirts(String s) {
    this.s = s;
  }


  @Override
  public int length() {
    return s.length();
  }

  @Override
  public char charAt(int index) {
    return s.charAt(length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return s.substring((length() - end - 1),(length() - start - 1));
  }

  public static void main(String[] args) {
    Gnirts g = new Gnirts("gameofthrones");
    System.out.println(g.length());
    System.out.println(g.charAt(7));
    System.out.println(g.subSequence(2,5));

  }

}
