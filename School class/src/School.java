import java.util.ArrayList;

public class School {

    public ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Teacher> teachers = new ArrayList<>();


    private String name;
    private String location;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    //when you perform an action, the code does not evaluate to anything
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);

    }

    public void removeStudent(Student student) {
        students.remove(student);

    }


    public void showTeachers(ArrayList<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(i);
        }
    }

    public void showStudents(ArrayList<Student> students) {

        for (int i = 0; i < students.size(); i++){
            System.out.println(i);

        }
    }
}