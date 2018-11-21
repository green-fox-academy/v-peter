package zoo.animals;

public class Bird extends Animal{
  int numberOfLegs = 2;

  public Bird(String s){
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
