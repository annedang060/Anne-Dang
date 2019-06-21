package sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Product {
    public String name;
    public String school;



     Product(String n, String school){
         name = n;
         this.school = school;



     }
     //getters and setters



       public void writeToFile() throws IOException{

           FileWriter fw = new FileWriter("products.txt", true);
           BufferedWriter bw = new BufferedWriter(fw);

           bw.write(name + ",\r");
           bw.write(school + ",\r");
           bw.write(":\r");
           bw.close();

       }


       public String toString(){
         return "Name: " + name + "\tSchool " + school;


       }
}
