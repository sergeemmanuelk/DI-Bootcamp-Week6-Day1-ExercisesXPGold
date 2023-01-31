public class Student {
    private String name;
    private int age;
    private String course;
    private char grade;

    public Student() {
        this.name = "";
        this.age = 0;
        this.course = "";
        this.grade = '\0';
    }

    public Student(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String course, char grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course + ", Grade: " + grade);
    }
}
