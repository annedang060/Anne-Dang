

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {




    public void search(String searchword, ArrayList<String> sentences) throws IOException {



            int Linecount = 0;
            FileReader fr = new FileReader("in.txt");



            BufferedReader br = new BufferedReader(fr);
            String sentence;

            while ((sentence = br.readLine()) != null) {
                sentences.add(sentence);
            }

            int LineCount = 0;
            String line = " ";

            while((line = br.readLine()) != null){

                LineCount++;

                int posFound = sentences.indexOf(searchword);

                if(posFound > -1){
                    System.out.println("search word found at positions" + posFound + " on line " + LineCount);


                }

            }

            br.close();


        }



    public static void main(String[] args) throws IOException {





    }


  }


