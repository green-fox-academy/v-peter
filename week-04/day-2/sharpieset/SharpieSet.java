package sharpieset;

import sharpie.Sharpie;

import java.util.ArrayList;
import java.util.Iterator;

public class SharpieSet {
    ArrayList<Sharpie> list = new ArrayList<>();

    int countUsable() {
        int count = 0;
        for (Sharpie a :
                list) {
            if (a.inkAmount != 0) count++;
        }
        return count;
    }

    void removeTrash() {
        Iterator<Sharpie> iter = list.iterator();
        int count = 0;
        while (iter.hasNext()) {
            Sharpie s = iter.next();
            if (s.inkAmount == 0) {
                iter.remove();
                count++;
            }
        }
        System.out.println("Removed " + count + " sharpie.");
    }

    public static void main(String[] args) {
        SharpieSet shS = new SharpieSet();
        shS.list.add(new Sharpie("green", 1));
        shS.list.add(new Sharpie("blue", 1));
        Sharpie sharpie = new Sharpie("black", 1);
        for (int i = 0; i < 100; i++) {
            sharpie.use();
        }
        shS.list.add(sharpie);
        shS.list.add(new Sharpie("red", 1));
        shS.list.add(new Sharpie("yellow", 1));
        System.out.println("Number of usable sharpies: " + shS.countUsable());
        shS.removeTrash();
        System.out.println(sharpie.inkAmount);
    }

}
