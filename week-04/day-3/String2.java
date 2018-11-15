public class String2 {
  public static void main(String[] args) {
    String s = "axcyxcsdfrwyxxcsecyx";
    char removable = 'x';
    System.out.println(stringRemover(s, removable));
  }

  public static String stringRemover(String s, char c){
    if (s.length() < 1) {
      System.out.println(s);
      return s;
    }
    else {
      String first = c == s.charAt(0) ? "" : s.charAt(0)+ "";
      return first + stringRemover(s.substring(1), c);
    }
  }
}