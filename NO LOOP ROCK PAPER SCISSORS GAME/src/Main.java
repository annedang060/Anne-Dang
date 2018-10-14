import java.util.Scanner;

public class Main{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper, and 's' for scissors");

        /*
        r = rock
        p = paper
        s = scissors
        */



        /*
        computerChoice:
        0 = rock
        1 = paper
        2 = scissors
         */

        String userChoice = input.nextLine();  //allows user input on the next line
        int computerChoice = (int) (Math.random() * 3);  //computer will pick a random number from 0-2
        String computer = "r";


        if (computerChoice==0);{ //if the computer randomly picks 0, the variable "computer" will read it as "r"

            computer = "r";
        }


        if(computerChoice==1){   //if the computer randomly picks 1, the variable "computer" will read it as "p"
            computer = "p";
        }

        if(computerChoice==2){  //if the computer randomly picks 2, the variable "computer" will read it as "s"
            computer = "s";

        }

        if(userChoice.equals("p")) {   //what the player and computer picked will be shown if the user types in "p"
            System.out.print("  Player choice:" + userChoice);
            System.out.println("     computer Choice:" + computer);
        }

        if(userChoice.equals("r")) {  //what the player and computer picked will be shown if the user types in "r"
            System.out.print("  Player choice:" + userChoice);
            System.out.println("     computer Choice:" + computer);
        }


        if(userChoice.equals("s")) {  ////what the player and computer picked will be shown if the user types in "s"
            System.out.print("  Player choice:" + userChoice);
            System.out.println("     computer Choice:" + computer);
        }





        if (userChoice.equals("p")) {

            if (computer.equals("r")) {   //if user picks "p" and the computer randomly chooses "r" then the user will win because paper beats rock
                System.out.println("You win!");
            }
            else if (computer.equals("p")) {  //if user picks "p" and computer also picks "p", then it is a draw
                System.out.println("Draw!");
            }

            else {
                System.out.println("You lose!");  //if the above conditions are false, then that means that the user lost because they picked "p" while the computer chose "s" and scissors beats paper


            }
        }



        else if (userChoice.equals("r")) {

            if (computer.equals("s")) { //if user picks "r" and the computer randomly chooses "s" then the user will win because rock beats scissors
                System.out.println("You win!");
            }

            else if (computer.equals("r")) {
                System.out.println("Draw!");
            } //if user picks "r" and computer also picks "r", then it is a draw


            else {
                System.out.println("you lose!"); //if the above conditions are false, then that means that the user lost because they picked "r" while the computer chose "p" and rock beats scissors

            }
        }


        else if (userChoice.equals("s")) {

            if (computer.equals("r")) {  //if user picks "s" and computer picks "r", user will lose since rock beats scissors
                System.out.println("You lose!");
            }

            else if (computer.equals("p")) {   //if user picks "s" and the computer randomly chooses "p" then the user will win because scissors beats paper
                System.out.println("You win!");
            }
            else {
                System.out.println("Draw!");  //if the above conditions are false, then that means that it is a draw since both the user and the computer chose "s"


            }


        }

        else{
            System.out.println("Invalid selection. Play again");
        }







    }
}