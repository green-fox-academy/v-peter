package animal;

public class Animal {
    public String name;
    public int hunger;
    public int thirst;

    public Animal(String name){
        this.name = name;
        hunger = 50;
        thirst = 50;
    }

    public void eat(){
        hunger--;
    }
    public void drink(){
        thirst--;
    }
    public void play(){
        hunger++;
        thirst++;
    }

    @Override
    public String toString() {
        return name;
    }
}
