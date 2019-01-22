public class Student {
    private String firstName;
    static int studentNum = 688395 ;
    private int id;

    Student(String firstName){
        this.firstName = firstName;
        this.id = studentNum;
        studentNum++;

    }

    public int getId(){
        return id;
     }

    public void setId(int id){
        this.id = id;
      }

    public String getFirstName(){
        return firstName;
     }

    public void setFirstName(){
        this.firstName = firstName;

     }

    public String toString(){
        return "student id:" + getId() + "\t" + "student name:" + getFirstName();

    }

    public static Courses[] add(Courses[] course, Courses num3){
        Courses[] temp = new Courses[course.length+1];

        for(int i=0; i<course.length; i++){
            temp[i] = course[i];

        }

        temp[course.length] = num3;

        return temp;
    }


    public static void average(Courses[] course){
        double sum = 0;

        for(int i =0; i<course.length; i++){
            sum += course[i].getGrade();
        }
        System.out.println("average is:" + sum/course.length);
    }

    public static void print(Courses[] course){
        for(int i =0; i<course.length; i++){
            System.out.println(course[i]);

        }

    }

}