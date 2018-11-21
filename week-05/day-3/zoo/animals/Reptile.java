package zoo.animals;

public class Reptile extends Animal {
  int numberOfLegs = 4;

  public Reptile(String s){
    name = s;
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void eat() {
    System.out.println(name+" is eating.");
  }
}
