package sample;

public class Product {
    public String name;
    public String school;
     private int age;


     Product(String n, String school, int age){
         name = n;
         this.school = school;
         this.age = age;


     }
     //getters and setters

       public int getAge(){

         return age;
       }

       public String toString(){
         return name;
       }
}
