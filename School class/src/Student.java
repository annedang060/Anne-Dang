
public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    static int studentNum = 678459;
    private int id;

    Student(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = studentNum;
        studentNum++;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "Name:" + getFirstName() + getLastName() + "\t" + "grade:" + getGrade();
    }
}