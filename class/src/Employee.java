public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

//setters and getters
    public int getID(){

        return id;
    }
    //methods
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){

        return firstName + lastName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){

        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        return (percent * salary) + salary;
    }


    public String toString(){
        return "Employee[id, name, last name, salary]" + id + firstName + lastName + salary;
    }
}