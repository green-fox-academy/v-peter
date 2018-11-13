package animal;

public class Animal {
    int hunger;
    int thirst;

    Animal(){
        hunger = 50;
        thirst = 50;
    }

    void eat(){
        hunger--;
    }
    void drink(){
        thirst--;
    }
    void play(){
        hunger++;
        thirst++;
    }

}
