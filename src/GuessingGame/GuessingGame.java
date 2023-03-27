package GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame(){
        System.out.println("Hi, Hello there!");
        System.out.println("(type your name)");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name + ", Im thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number.");

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        while(true){
            System.out.println("Your guess?");
            Scanner guess = new Scanner(System.in);
            int numberGuess;

            try {
                numberGuess = guess.nextInt();
            } catch (Exception e) {
                System.out.println("That's not an integer, try again");
                continue;
            }


            if (numberGuess != randomNumber){
                if(numberGuess < randomNumber){
                    System.out.println("Your guess is too low, try again.");
                }else {
                    System.out.println("You guess is too high, try again.");
                }
            }else {
                System.out.println("You are correct!");
                break;
            }

        }

    }
}
