package aircraftcarrier;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrier {
  int ammoStore;
  ArrayList<Aircraft> aircrafts;
  int hp;
  String name;

  public Carrier(int initAmmo, int hp, String name) {
    aircrafts = new ArrayList<>();
    ammoStore = initAmmo;
    this.hp = hp;
    this.name = name;
  }

  void add(Aircraft a) {
    aircrafts.add(a);
  }

  void fill() throws Exception {
    if (ammoStore == 0) throw new Exception("No ammo in store");
    if (hp <= 0) return;
    for (Aircraft a :
        aircrafts) {
      if (a.isPriority && ammoStore > 0) {
        ammoStore = a.refill(ammoStore);
      } else continue;
    }
    for (Aircraft a :
        aircrafts) {
      if (ammoStore > 0) {
        ammoStore = a.refill(ammoStore);
      } else break;
    }
    System.out.println(name + " is filled.");
  }

  int totalDamage() {
    int damage = 0;
    for (Aircraft a :
        this.aircrafts) {
      damage += a.baseDamage * a.ammo;
    }
    return damage;
  }

  void fight(Carrier c) {
    System.out.println(name + " fights " + c.name);

    Iterator<Aircraft> i1 = aircrafts.iterator();
    Iterator<Aircraft> i2 = c.aircrafts.iterator();

    while ((hp > 0 && c.hp > 0) && i1.hasNext() && i2.hasNext()) {
      c.hp -= i1.next().fight();
      hp -= i2.next().fight();
    }
    while ((hp > 0 && c.hp > 0) && i1.hasNext())
      c.hp -= i1.next().fight();
    while ((hp > 0 && c.hp > 0) && i2.hasNext())
      hp -= i2.next().fight();
  }

  String getStatus() {
    if (hp <= 0) return "It's dead Jim :(";
    String s = "";
    s += "Name: " + name + " HP: " + hp + ", Aircraft count: " + aircrafts.size() +
        ", Ammo Storage: " + ammoStore + ", Total damage: " + totalDamage() + "\n";
    s += "Aircrafts:\n";
    for (Aircraft a :
        aircrafts) {
      s += a.getStatus() + "\n";
    }
    return s;
  }

}
