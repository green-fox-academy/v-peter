package sum;

import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> list) throws NullPointerException{
    int r = 0;
    for (Integer integer :
        list) {
      r += (int) integer;
    }
    return r;
  }

}
