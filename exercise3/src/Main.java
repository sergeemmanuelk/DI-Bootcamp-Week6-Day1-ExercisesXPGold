public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Serge", 27);
        Student student3 = new Student("Emmanuel", 27, "Computer Science", 'A');

        System.out.println("Student 1:");
        student1.displayStudentInfo();

        System.out.println("Student 2:");
        student2.displayStudentInfo();

        System.out.println("Student 3:");
        student3.displayStudentInfo();
    }
}