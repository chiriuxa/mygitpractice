import java.util.Scanner;

public class HwDoHwyLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*//        Write a program to print numbers from 1 to 10.

        var a = 1;

        do {
            System.out.println(a);
            a++;

        }while (a <= 10);*/

//        2 Write a program to calculate the sum of first 10 natural number.
/*
        int num = 10, sum = 0;

       for (int a = 1; a <= num; ++a ) {
           sum = sum += a;
       }

        System.out.println(sum);*/

//        Write a program that prompts the user to input a positive
//        integer. It should then print the multiplication table of that number

    /*    System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
        }*/

       /* Write a do-while loop that asks the user to enter two numbers.
                The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to
        perform the operation again. If so, the loop should repeat;
        otherwise it should terminate
*/


        int num1, num2;
        char choice;

        do
        {
            System.out.print("Enter the first number ");
            num1 = input.nextInt();

            System.out.print("Enter the second number ");
            num2 = input.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);

            System.out.print("Do you want to continue y/n? ");
            choice = input.next().charAt(0);

            System.out.println();

        }while(choice=='y' || choice == 'Y');


    }
}

