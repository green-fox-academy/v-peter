package zoo.animals;

public abstract class Animal {
  String name;
  int age;
  String gender;
  String color;

  public String getName(){
    return name;
  }

  public abstract String breed();

  abstract void eat();


}
