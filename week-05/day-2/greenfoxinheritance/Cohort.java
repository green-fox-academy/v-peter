package greenfoxinheritance;

import java.util.ArrayList;

public class Cohort {
  String name;
  ArrayList<Student> students;
  ArrayList<Mentor> mentors;

  public void addStudent(Student s) {
    students.add(s);
  }

  public void addMentor(Mentor m) {
    mentors.add(m);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }
}
