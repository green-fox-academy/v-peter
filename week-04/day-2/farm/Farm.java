package farm;

import animal.Animal;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    ArrayList<Animal> animalList;
    int slots;

//    public Farm(ArrayList<Animal> animalList, int slots) {
//        this.animalList = animalList;
//        this.slots = slots;
//    }

    public Farm(int slots) {
        animalList = new ArrayList<>();
        this.slots = slots;
    }

    void breed() {
        if (slots > 0) {
            Animal a = new Animal("breeded");
            animalList.add(a);
        }

    }

    void slaughter() {
        int leastHungry = Integer.MAX_VALUE;
        int n = -1;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).hunger < leastHungry) n = i;
        }
        if (n >= 0 && n <= animalList.size()) {
            System.out.println(animalList.get(n).name + " is dead :(");
            animalList.remove(n);
        }
    }

    public static void main(String[] args) {
        Farm f = new Farm(12);
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal pig = new Animal("pig");
        Animal cattle = new Animal("cattle");
        Animal chicken = new Animal("chicken");
        f.animalList.add(cat);
        f.animalList.add(dog);
        f.animalList.add(pig);
        f.animalList.add(cattle);
        f.animalList.add(chicken);

        f.breed();


        chicken.play();
        dog.play();
        pig.play();
        pig.play();
        dog.play();
        cattle.play();
        chicken.play();
        chicken.play();
        chicken.play();
        chicken.play();

        f.slaughter();

        System.out.println("Animals in the farm: "+Arrays.toString(f.animalList.toArray()));
    }

}
