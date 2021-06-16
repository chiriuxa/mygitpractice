package HomeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HwOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TASK 1.  Ask user to enter 3 int, and store the total of all 3 int to an long (casting)
        // and print in console
       /* System.out.println("Enter your net income : ");
        int income = input.nextInt();
        System.out.println("Enter your spouse net income : ");
        int spouseIncome = input.nextInt();
        System.out.println("Enter your other revenue : ");
        int otherIncome = input.nextInt();
        long grossIncome = income + spouseIncome + otherIncome;
        System.out.println("Your gross household income is : " + grossIncome +"$");*/

        //TASK 2.  Ask user to enter 1 byte, 1 short and 1 int. Print the user's input after each enter
        // ('You entered number one : value ).Compare all 3 values using '&&' (logical operators) and print true.
        //Also store all 3 values into float and Print = "Total float number is (value here)".
      /*  System.out.println("Please enter your age : ");
        byte age = input.nextByte();
        System.out.println("You are " + age + " years old");

        System.out.println("Please enter your year of birth : ");
        short yearOfBirth = input.nextShort();
        System.out.println("You was born in  " + yearOfBirth );

        System.out.println("Please enter current year : ");
        int curentYear = input.nextInt();
        System.out.println("Current year is : " + curentYear);

        float total = age + yearOfBirth + curentYear;

        System.out.println(age < yearOfBirth && yearOfBirth < curentYear);
        System.out.println("Total float number is : " + total);
*/

 /*      // TASK 3.  Write a program that asks user 4 numbers returns largest
        // number using comparison operator (&& , ||).

        *//*TASK 4.  Write a program that asks user to enter first name, last name, age, favorite car
        and language you speak.
                And print each value with a full sentence like :
        My full name is …
        I am ….
        My favorite car is …
        I speak …. languages*//*

        System.out.println("Please enter your name ");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name ");
        String lastName = input.nextLine();

        System.out.println("Please enter your age");
        int age = input.nextInt();

        System.out.println("Please enter your favorite car");
        String favoriteCar = input.next();

        System.out.println("Please enter the language what you speak ");
        String language = input.next();

        System.out.println("My full name is : " + firstName + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("My favorit car is : " + favoriteCar);
        System.out.println("I speak " + language + " languages");*/

/*//      TASK 5.  Write a program asks user to enter an int (mile) and convert it into km (kilometer).
//       Output: You entered (user input) and it converts to (km value) km.

        System.out.println("Please enter the number of used miles");
        int mile = input.nextInt();

        double kilometers = mile * 1.66667;

        System.out.println("You entered " + mile + "and it converts to " + kilometers + "km");*/

       // TASK 6.  Write a java program that asks user to enter int
        // (as gallons) and convert it into int (liter).
/*
        System.out.println("Pleas enter the number of purchased gallons");
        double gallons = input.nextDouble();

        double liters = gallons * 3.7854118;

        System.out.println("You entered " + gallons + "and it converts to " +liters + " l");*/

       // TASK 7.  Write a java program that asks user to enter seconds
        // \(only) and print how many hours or minutes .
/*

           System.out.println("Please enter the number of seconds : ");
        int sec = input.nextInt();

        int min = sec / 60;
        int hour = min / 60;

        int secPrint = sec % 60;
        int minPrint = min % 60;
        int hourPrint = hour % 60;

        System.out.println(hourPrint + " Hours, " + minPrint + " Minutes, " + secPrint + " Seconds");
*/

    }
}
