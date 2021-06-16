package HomeWork;

import java.util.Scanner;

public class HwIfElse {
    public static void main(String[] args) {

  /*      CODING HOMEWORK:
        1.Declare int variables: seniorCitizens, nonSeniorCitizens, age
        2.Create a Scanner object
        3.Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
        4.“Enter current count for-senior Citizens and nonSeniorCitizens:”
        5.Ask user to enter age:
        6.“What is new citizen’s age?”
•if citizen’s age is more than or equals to 65 then print “Senior Citizen”
and increment seniorCitizens variable by 1.
•if citizen’s age is less than 65 then print “Non-Senior Citizen” and increment nonSeniorCitizens variable by 1.
        7.Last print another message:
        8.“New seniorCitizens count ValueOfVariable”
        9.“New nonSeniorCitizens count ValueOfVariable”*/

        Scanner input = new Scanner(System.in);

        int seniorCitizens, nonSeniorCitizens, age;

        System.out.println("Enter current count for - senior Citizens");
        seniorCitizens = input.nextInt();

        System.out.println("Enter current count for - nonSeniorCitizens");
        nonSeniorCitizens = input.nextInt();

        System.out.println("What is new citizen’s age");
        age = input.nextInt();

        if (age >= 65) {
            System.out.println("Senior Citizen");
            ++seniorCitizens;

        }else {
            System.out.println("Non-Senior Citizen");
            ++nonSeniorCitizens;
        }

        System.out.println("New senior Citizens count " + seniorCitizens);

        System.out.println("New non senior Citizens count " + nonSeniorCitizens);



    }
}
