import java.util.Scanner;
public class Main {


    public static void main (String[]args){


        Scanner input = new Scanner(System.in);
        Student firstStudent = new Student("sofia");
        System.out.println(firstStudent.toString());

        Courses first = new Courses("pe", 67);
        System.out.println(first.toString());


        //calling the three methods
        Courses[] course = new Courses[3];
        Courses num0 = new Courses("french", 67);

        Courses num1 = new Courses("science", 34);

        Courses num2 = new Courses("socials", 56);

        Courses num3 = new Courses("new course", 43);


        course[0] = num0;
        course[1] = num1;
        course[2] = num2;


        //calling the method to add a course to the students array

        course = Student.add(course, num3);
        System.out.println("start? y/n");
        String user = input.nextLine();
        System.out.println("Method that adds new course to array");
        if (user.equals("y")) {
            for (int i = 0; i < course.length; i++) {
                System.out.println(course[i]);
            }

            //calling method to print out all courses
            System.out.println("Method to print out all courses");
            Student.print(course);
            Student.average(course);

        }

    }


}