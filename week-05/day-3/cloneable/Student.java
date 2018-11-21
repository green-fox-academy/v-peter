package cloneable;

public class Student extends Person {
  String previousOrganization;
  int skippedDays;


  public void getGoal(){
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }


  public Student() {
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return this;
  }

  static Student john = new Student("John", 20,"male","BME");




  public static void main(String[] args){
    Student johnTheClone = new Student();
    try {
      johnTheClone = (Student) john.clone();

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    System.out.println("The clone's name: "+johnTheClone.name);

  }



}
