package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Domino implements Comparable{
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }



  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Object o) {
    if (((Domino) o).left > left) {
        return -1;
    }
    if (((Domino) o).left < left) {
        return 1;
    }
    if (((Domino) o).left == left) {
      if (((Domino) o).right > right){
        return -1;
      }
      if (((Domino) o).right < right){
        return 1;
      }
    }
    return 0;
  }

  public static void main(String[] args){
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);

    System.out.println(dominoes);

  }

}
