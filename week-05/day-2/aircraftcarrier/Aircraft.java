package aircraftcarrier;

public class Aircraft {
  String type;
  int ammo;
  int maxAmmo;
  int baseDamage;
  boolean isPriority;

  public int fight() {
    int ammoUsed = ammo;
    ammo = 0;
    return ammoUsed * baseDamage;
  }

  public int refill(int amount) {
    while(amount > 0){
      if (ammo < maxAmmo) {
        ammo++;
        amount--;
      }
      else break;
    }
    return amount;
  }

  public String getType() {
    return type;
  }

  public String getStatus() {
    return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * ammo;
  }



}
