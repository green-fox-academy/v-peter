package zoo.animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
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

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
