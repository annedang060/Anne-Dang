import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }

        }


        //your code here
        return count;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
       int length = s.length()-2;
       int countBob = 0;

       for(int i = 0; i<length; i++){

           if(s.charAt(i)=='b'){
              if(s.charAt(i+1)=='o' && s.charAt(i+2)=='b') {
                  countBob++;
              }
           }
       }


        //your code here
        return countBob;
    }


    static String problemThree(String s) {

        String temp = String.valueOf(s.charAt(0));
        String longestSub = String.valueOf(s.charAt(0));

        for(int i = 0; i<s.length()-1; i++){

            if(s.charAt(i) <= s.charAt(i + 1)){
                temp = temp + s.charAt(i + 1);

                if(temp.length()>longestSub.length()){
                    longestSub = temp;
                }

            }


            else if(s.charAt(i) > s.charAt(i + 1)){
                temp = "";
                temp = String.valueOf(s.charAt(i + 1));

            }



        }

        return longestSub;
    }



    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);


        System.out.println("would you iike to start? y/n");
        String user = input.nextLine();
        if(user.equals("n")){
            System.out.println("goodbye");
        }

        boolean startGame = user.equals("y");

        while(startGame) {
            System.out.println("input a string to problem 1");
            String s = input.nextLine();
            System.out.println("number of vowels in the string:" + problemOne(s));

            System.out.println("input a string for problem 2");
            String problemTwo = input.nextLine();
            System.out.println("number of times that the word bob appears:" + problemTwo(problemTwo));

            System.out.println("input a string for problem 3");
            String problemThree = input.nextLine();
            System.out.println("longest alphabetical substring in string s is:" + problemThree(problemThree));

        }
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */


    }
}

