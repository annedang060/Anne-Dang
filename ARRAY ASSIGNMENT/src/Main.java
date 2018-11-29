import java.util.Scanner;
public class Main {

    public static int[] addNum(int[] array, int num){

        int[] temp = new int[array.length + 1];

        for(int i =0; i<array.length; i++){
            temp[i] = array[i];

        }

        temp[array.length] = num;

        return temp;
    }



    public static int[] pop(int[] array){

        int[] partTime = new int[array.length-1];

        for(int i=0; i<array.length-1; i++){

            partTime[i] = array[i];
        }


        return partTime;



    }


    public static int[] insert(int[] array, int index, int value){

        int[]  newArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i++){

            if(i<index){
                newArray[i] = array[i];
            }

            if(i==index){
                newArray[i] = value;
            }

            if(i>index){
                newArray[i] = array[i-1];
            }

        }
        newArray[array.length] = array.length-1;
        return newArray;



    }








    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to start changing up you array? y/n");
        String user = input.nextLine();
        boolean inGame = user.equals("y");

        if(user.equals("n")){
            System.out.println("goodbye!");
        }



        while(inGame) {
            System.out.println("Original array: {0,1,2,3,4,5}");

            int[] nums = {0, 1, 2, 3, 4, 5};

            int[] delete = {0, 1, 2, 3, 4, 5};

            int[] insert = {0, 1, 2, 3, 4, 5};

            int index = 3;
            int replace = 8;

            nums = addNum(nums, 6);
            delete = pop(delete);
            insert = insert(insert, index, replace);


            System.out.println("Would you like to add a value, delete a value, or insert a value at a specific spot on this array?");
            String play= input.nextLine();


            if (play.equals("add")) {

                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i]);
                }

            }

            if (play.equals("delete")) {
                for (int i = 0; i < delete.length; i++) {

                    System.out.println(delete[i]);
                }
            }

           else if (play.equals("insert value")) {
                for (int i = 0; i < insert.length; i++) {
                    System.out.println(insert[i]);
                }
            }

            if(play.equals("goodbye")){
                System.out.println("GameOver");
                break;
            }







        }

    }



}