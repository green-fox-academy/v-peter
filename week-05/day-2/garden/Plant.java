package garden;

public class Plant {
  String color;
  int absorb;
  int minWater;
  double water;
  String type;

  public void status() {
    if (needWater())
      System.out.println("The " + color + " " + type + " needs water");
    else
      System.out.println("The " + color + " " + type + " doesnt need water");
  }

  public Plant(String color) {
    this.color = color;
  }

  public Plant() {
  }

  public boolean needWater(){
    if (water < minWater) return true;
    return false;
  }

public void watering(double amount){
    this.water += amount * absorb / 100;
}

}
