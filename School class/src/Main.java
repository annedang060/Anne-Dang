import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        System.out.println("Add 10 students to arraylist");
        for(int i = 0; i<10; i++){
            Student student = new Student("student", " " + i, 10);
            students.add(student);
        }
        System.out.println(students);

        System.out.println("Add 3 teachers");
        for(int i = 0; i<3; i++){
            Teacher teacher = new Teacher("teacher", " " + i, "subject" + i);
            teachers.add(teacher);
        }

        System.out.println(teachers);

        System.out.println("remove 2 students from list");
        for(int i =0; i<2; i++){
            students.remove(i);

        }

        System.out.println(students);

        System.out.println("remove 1 teacher from list");
        for(int i =0; i<1; i++){
            teachers.remove(i);

        }
        System.out.println(teachers);
    }


}