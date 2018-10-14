

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("would you like to start the process of encryption? y/n");

        String start = input.nextLine();

        if (start.equals("n")) {
            System.out.println("Goodbye");
        }

        boolean startProcess = start.equals("y");

          while (startProcess) {

            System.out.println("What message would you like to encrypt?");

            String userChoice = input.nextLine();

            if (userChoice.equals("n")) {
                System.out.println("Goodbye");
            }

            System.out.println("This message has been encrypted to...");

            String lastChar = userChoice.substring(userChoice.length() - 1);

            userChoice = userChoice.replaceAll(lastChar, "");

            System.out.println(lastChar + userChoice + "ay");


            System.out.println("Would you like to decrypt the message back now? y/n");

            String decrypt = input.nextLine();

            if (decrypt.equals("n")) {
                System.out.println("okay goodbye then!");
            }
            if (decrypt.equals("y")) {
                System.out.println(userChoice + lastChar);
            }

           else if(userChoice.equals("done")){
                System.out.println("Thank you for ecrypting and decrypting");
                break;
            }

              System.out.println("*****************************************************************************");

        }

    }
}
