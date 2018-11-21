package zoo.animals;

public class Mammal extends Animal {
  int numberOfLegs = 4;

public Mammal(String s){
  name = s;
}

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  public void eat() {
    System.out.println(name+" is eating.");
  }
}
