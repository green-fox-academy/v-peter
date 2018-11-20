package garden;

public class Main {
  public static void main(String[] args) {
    Garden g = new Garden();
    Tree t1 = new Tree("purple");
    g.addTree(t1);
    Tree t2 = new Tree("orange");
    g.addTree(t2);
    Flower f1 = new Flower("yellow");
    g.addFlower(f1);
    Flower f2 = new Flower("blue");
    g.addFlower(f2);

    g.status();
    System.out.println();
    g.watering(40);
    g.status();
    System.out.println();
    g.watering(70);
    g.status();
  }

}
