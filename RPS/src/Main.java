import java.util.Scanner;


public class Main{


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //ask weather user wants to start game
        System.out.println("Do you want to start a new game? (y/n) ");
        String play = input.nextLine();
        boolean inGame = play.equals("y"); //boolean inGame is true if the string "play" equals "y"


        int comScore = 0; //computer score
        int userScore = 0; // user score
        int gamePenalty = 0; // everytime the user types something invalid, game penalty will come into play


        while (inGame) {


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



            if (computerChoice == 0) ;
            { //if the computer randomly picks 0, the variable "computer" will read it as "r"

                computer = "r";
            }


            if (computerChoice == 1) {   //if the computer randomly picks 1, the variable "computer" will read it as "p"
                computer = "p";
            }

            if (computerChoice == 2) {  //if the computer randomly picks 2, the variable "computer" will read it as "s"
                computer = "s";

            }


            if (userChoice.equals("p")) {

                if (computer.equals("r")) {   //if user picks "p" and the computer randomly chooses "r" then the user will win because paper beats rock
                    System.out.println("You win!");
                    userScore++;
                }
                else if (computer.equals("p")) {  //if user picks "p" and computer also picks "p", then it is a draw
                    System.out.println("Draw!");
                }

                else {
                    System.out.println("You lose!");  //if the above conditions are false, then that means that the user lost because they picked "p" while the computer chose "s" and scissors beats paper
                    comScore++;

                }
            }



            else if (userChoice.equals("r")) {

                if (computer.equals("s")) { //if user picks "r" and the computer randomly chooses "s" then the user will win because rock beats scissors
                    System.out.println("You win!");
                    userScore++;
                }

                else if (computer.equals("r")) {
                    System.out.println("Draw!");
                } //if user picks "r" and computer also picks "r", then it is a draw


                else {
                    System.out.println("you lose!"); //if the above conditions are false, then that means that the user lost because they picked "r" while the computer chose "p" and rock beats scissors
                     comScore++;
                }
            }


            else if (userChoice.equals("s")) {

                if (computer.equals("r")) {  //if user picks "s" and computer picks "r", user will lose since rock beats scissors
                    System.out.println("You lose!");
                    comScore++;
                }

                else if (computer.equals("p")) {   //if user picks "s" and the computer randomly chooses "p" then the user will win because scissors beats paper
                    System.out.println("You win!");
                    userScore++;
                }

                else {
                    System.out.println("Draw!");  //if the above conditions are false, then that means that it is a draw since both the user and the computer chose "s"


                }
            }



           else {
               System.out.println("invalid selection. Play again");
               gamePenalty++;
                System.out.println("Game penalty:" + gamePenalty);
           }

           if(gamePenalty==3){
               System.out.println("sorry too many invalid answers! Better luck next time");
               break;
           }


           else if(userChoice.equals("done")){
               System.out.println("Thanks for playing!");
               System.out.println("Total user score:" + userScore );
               System.out.println("Total computer score:" +comScore);
               System.out.println("Total game penalty:" + gamePenalty);
               break;
           }




            if(userChoice.equals("r") || userChoice.equals("p") || userChoice.equals("s")){

                System.out.print("  Player choice:" + userChoice);
                System.out.println("     computer Choice:" + computer);

                System.out.print("  Player score:" + userScore);
                System.out.println("     computer score:" + comScore);

                System.out.println("  game penalty:" + gamePenalty);

            }




            System.out.println("*************************************************************************************");


        }


    }
}




