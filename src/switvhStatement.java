import java.util.Random;
import java.util.Scanner;

public class switvhStatement {
    public static void main(String[] args) {

    /*    int dayNumber = 2;

        switch (dayNumber){
            case 1:
                System.out.println("Today day is Monday");
                break;
            case 2:
                System.out.println("Today day is Tuesday");
                break;
            case 3:
                System.out.println("Today day is Wednesday");
                break;
            case 4:
                System.out.println("Today day is Thursday");
                break;
            case 5:
                System.out.println("Today day is Friday");
                break;
            case 6:
                System.out.println("Today day is Saturday");
                break;
            case 7:
                System.out.println("Today day is Sunday");
                break;
            default:
                System.out.println("invalid impute");
        }
*/
        Scanner input = new Scanner(System.in);
        /*System.out.println("Please enter current month");
        String monthName = input.nextLine();*/

/*
        switch (monthName) {
            case "January":
            case "February":
            case "December":
                System.out.println("Now is winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Now is spring");
                break;

            case "June":
            case "July":
            case "August":
                System.out.println("Now is summer");
                break;

            case "September":
            case "Octomber":
            case "November":
                System.out.println("Now is the autumn");
                break;

            default:
                System.out.println("Invalid impute");
        }*/
/*

        System.out.println("Please enter a letter from a to f using lower or upper case");
        char letter = input.next().charAt(0);

        switch (letter) {
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;

            case 'b':
            case 'B':
                System.out.println("Great");
                break;

            case 'c':
            case 'C':
                System.out.println("Okay");
                break;

            case 'd':
            case 'D':
                System.out.println("You can do better");
                break;

            case 'f':
            case 'F':
                System.out.println("Something needs to change");
                break;

            default:
                System.out.println("Wrong input");
        }
*/


        //System.out.println("Enter number");
        //int number = input.nextInt();

        //Random num = new Random();
       //b int randomInt = num.nextInt(15);


     /*   if (randomInt >= 1 && randomInt <= 7 )  {
            switch (randomInt){
                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;
            }

        }else{
            System.out.println("Invalid input");
        }
*/

    /*    //String txt = (AgG);
        var txt = "AgG";

       // int num = 10;
        var num = 10;*/

        Random number = new Random();
        var randomInt = number.nextInt(10);

        System.out.println("Please enter any number between 0 and 10");
        var numFromUser = input.nextInt();

        System.out.println(randomInt);
        if (numFromUser == randomInt) {
            System.out.println("congrats you guessed right");

        }else if (randomInt >= numFromUser) {
            System.out.println("You guess to low");

        }else if (randomInt <= numFromUser) {
            System.out.println("You guess to hi");
        }else
            System.out.println("game over");




    }
}
