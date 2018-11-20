package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Carrier c1 = new Carrier(300, 4000, "Empire Star-Destroyer");
    Carrier c2 = new Carrier(200, 5000, "George Washington");
    F16 f161 = new F16();
    c1.add(f161);
    F16 f162 = new F16();
    c2.add(f162);
    F16 f163 = new F16();
    c1.add(f163);
    F16 f164 = new F16();
    c2.add(f164);
    F16 f165 = new F16();
    c2.add(f165);
    F35 f351 = new F35();
    c1.add(f351);
    F35 f352 = new F35();
    c2.add(f352);
    F35 f353 = new F35();
    c1.add(f353);
    F35 f354 = new F35();
    c2.add(f354);
    F35 f355 = new F35();
    c1.add(f355);

    try {
      c1.fill();
      c2.fill();
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(c1.getStatus());
    System.out.println(c2.getStatus());

    do {
      c1.fight(c2);
      System.out.println();

      System.out.println(c1.getStatus());
      System.out.println(c2.getStatus());
      if (!(c1.hp > 0 && c2.hp > 0)) break;

      try {
        c1.fill();
        c2.fill();
      } catch (Exception e) {
        e.printStackTrace();
      }

      System.out.println(c1.getStatus());
      System.out.println(c2.getStatus());
    } while (c1.hp > 0 && c2.hp > 0);

  }
}
