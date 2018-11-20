package garden;

public class Tree extends Plant{



  public Tree(String color) {
    super(color);
    this.absorb = 40;
    this.minWater = 10;
    this.water = 0;
    this.type = "Tree";
  }
}
