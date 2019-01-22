public class Courses {
    private String name;
    private int grade;

    Courses() {
        grade = 78;
        name = "";

    }

    Courses(String subjectName, int studentGrade) {

        this.name = subjectName;
        this.grade = studentGrade;

    }

    public String getSubjectName() {

        return name;
    }

    public void setSubjectName() {

        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;

    }

    public String toString() {
        return "Course:" + getSubjectName();


    }
}







