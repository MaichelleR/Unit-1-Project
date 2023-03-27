package MarsWeek;

import GuessingGame.GuessingGame;

public class Mars {
    public static void main(String[] args) throws InterruptedException {

        String colonyName = "Reynoldvile";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - shipPopulation * 1.5;
        System.out.println(meals);
        meals = meals + (meals * 0.5);
        System.out.println(meals);
        shipPopulation = shipPopulation + 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Oceans";
        if(landingLocation.equalsIgnoreCase("THe plain")) {
            System.out.println("Bdzzz Landing on the Plain");
        }else{
                System.out.println("ERROR!!! Flight Plan already set");
            }

        new GuessingGame();

        }

        public static boolean landingCheck(int minutesLeft)throws InterruptedException {

        for (int minute = 0 ; minute == minutesLeft; minute++ ){

            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
            System.out.println("Landed");
            return false;
    }

    }
