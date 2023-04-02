package MarsExpedition;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() {

        Scanner input = new Scanner(System.in);
        System.out.println("Program Starting....");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name);
        System.out.println("Are you ready to head out into the new world? Type Y or N");
        String newWorld = input.nextLine();

        if (newWorld.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");

        } else {
            System.out.println("Too bad you are team leader. You have to go");

        }

        System.out.println("How many people do you want on your team");
        Integer number = input.nextInt();
        System.out.println(number);
        if (number > 2) {
            System.out.println("That's too many people");
            number = 2;
            }else{
                System.out.println("Your team is ready to go");
            number = 2;
            }
        System.out.println("You are allowed to bring one snack, what do you want to bring?");
        String snack = input.next();
        System.out.println("Nice choice " + snack + " You will be bring your snack with you");
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String vehicleChoice = input.next();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        } else {
            vehicleChoice = "your feet";

        }
        System.out.println(vehicleChoice);
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + number + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
        }


    }