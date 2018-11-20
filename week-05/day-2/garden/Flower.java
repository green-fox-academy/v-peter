package garden;

public class Flower extends  Plant{

  public Flower(String color) {
    super(color);
    this.absorb = 75;
    this.minWater = 5;
    this.water = 0;
    this.type = "Flower";
  }


}
