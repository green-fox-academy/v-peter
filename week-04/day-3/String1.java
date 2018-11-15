public class String1 {
  public static void main(String[] args) {
    String s = "a";
    System.out.println(s.substring(1));
    System.out.println(stringChanger("I've got six excellent experiences at GreenFoxAcademy", 'x', 'y'));
  }

  public static String stringChanger(String s, char from, char to) {

    if (s.length() < 1) {
      System.out.println(s);
      return s;
    }
    else {
      char first = from == s.charAt(0) ? to : s.charAt(0);
      return first + stringChanger(s.substring(1), from, to);
    }
  }
}