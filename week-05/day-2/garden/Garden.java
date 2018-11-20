package garden;

import java.util.ArrayList;

public class Garden {
  ArrayList<Tree> trees;
  ArrayList<Flower> flowers;

  public Garden() {
    trees = new ArrayList<>();
    flowers = new ArrayList<>();
  }

  public void addFlower(Flower f){
    flowers.add(f);
  }
  public void addTree(Tree t){
    trees.add(t);
  }


//  public int numberOfPlants(){
//   return trees.size() + flowers.size();
//  }


  public int needWater(){
    int n = 0;
    for (Flower f :
        flowers) {
      if (f.needWater()) n++;
    }
    for (Tree t :
        trees) {
      if (t.needWater()) n++;
    }
    return n;
  }

  public void watering(double amount) {
    double waterDose = (double) amount / needWater();

    for (Flower f :
        flowers) {
      if (f.needWater()) f.watering(waterDose);
    }
    for (Tree t :
        trees) {
      if (t.needWater()) t.watering(waterDose);
    }

    System.out.println("Watering with "+(int)amount);
  }

  public void status(){
    for (Flower f :
        flowers) {
      f.status();
    }
    for (Tree t :
        trees) {
      t.status();
    }
  }



}
