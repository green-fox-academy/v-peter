public class String3 {
  public static void main(String[] args) {
    String s = "ntasdfwfwgwgwr";
    String c = "*";
    System.out.println(stringSeparator(s, c));
  }

  public static String stringSeparator(String s, String c) {
    if (s.length() < 1) {
      return s;
    } else {
      return c + s.charAt(0) + stringSeparator(s.substring(1), c);
    }
  }
}