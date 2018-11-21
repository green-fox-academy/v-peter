package charsequence;

public class Shifter implements CharSequence {
  String s;
  int shift;

  public Shifter(String s, int shift) {
    this.s = s;
    this.shift = shift;
  }

  @Override
  public int length() {
    return s.length();
  }

  @Override
  public char charAt(int index) {
    return s.charAt(index + shift);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return s.substring(start + shift, end + shift);
  }

  public static void main(String[] args) {
    Shifter s = new Shifter("gameofthrones", 3);
    System.out.println(s.length());
    System.out.println(s.charAt(7));
    System.out.println(s.subSequence(2,5));

  }

}
