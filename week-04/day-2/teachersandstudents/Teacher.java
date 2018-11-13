package teachersandstudents;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void teach(Student student){
        student.learn(this);
    }

    void answer(Student student){
        System.out.println(name+" answers "+student.name);
    }

}
