package sample;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateProduct {
    private static String name;
    private static String school;
    private static int age;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Product> products = new ArrayList<Product>();

    public static ArrayList createAllProducts(String fileName) throws IOException{
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String line;
        String productString = " ";
        while((line = br.readLine()) != null){

            if(!line.equals(";")){
                productString += line;


            }

            else{
              parseProduct(productString);
              productString = " ";


            }

        }

        return products;

    }

    private static void parseProduct(String string){

        int pos = 0;
        String name = "";
        String school = "";
        int age = 0;

        for(int i =0; i<string.length(); i++){
            if(string.substring(i, i+1).equals(",")){

                pos = i;
                name = string.substring(0, pos);
                school = string.substring(pos + 1);
            }


        }

        products.add(new Product(name, school));

    }
}
