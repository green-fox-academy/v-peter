package teachersandstudents;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    void learn(Teacher t) {
        System.out.println(name + " learns " + t.subject);
    }

    void question(Teacher t) {
        t.answer(this);
    }

}
