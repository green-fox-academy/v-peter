package teachersandstudents;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Gabor", "French");
        Teacher t2 = new Teacher("Zsofi", "History");
        Student s1 = new Student("Peter");
        Student s2 = new Student("Gerzsonka");
        t1.teach(s1);
        s2.question(t2);

    }
}