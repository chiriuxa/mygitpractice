package HomeWork;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


public class HwIfElseDay3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String userName = JOptionPane.showInputDialog
//                ("Create user name") ;
//        String passWord  = JOptionPane.showInputDialog
//                ("Create password");

       /*SECOND HOME WORK  : Login.
                Create 2 String variables for your username and password.
        Write a program that asks from the user to enter the username.
        If username matches then ask for password. If password matches too, then print “Login successful!“.
        If username is true but password is not true, print “wrong password”
        if username doesn’t match, print “invalid username.*/


        /*    String userName = "Kiril";
        String passWord = "Student";

        String userNameFromUser = JOptionPane.showInputDialog
                ("Please enter user name");


        if (userName.equals(userNameFromUser) ) {
            String passWordNameFromUser = JOptionPane.showInputDialog
                    ("Please enter the password");

            if (passWordNameFromUser.equals(passWord)) {
                System.out.println("You successful logged in");

            }else {
                System.out.println("Incorrect password");
            }


        }else {
            System.out.println("Incorrect user name ");
        }*/
/*
        THIRD HOME WORK :
        Write a program that will print out month names by receiving a number.
                USE IF ELSE .
        Example: Display message: “Enter month number:”
        input: 5
        Display message: “May”
        input: 1
        Display message: “January” … and so on do all 12 month !
                If an invalid month number is
        entered print “Invalid month number”*/

       /* System.out.println("Enter month number ");
        int numb1 = input.nextInt();

        if (numb1 ==1){
            System.out.println("Monday");
        } else if (numb1 ==2){
            System.out.println("Tuesday");
        } else if (numb1 ==3){
            System.out.println("Wednesday");
        } else if (numb1 ==4){
            System.out.println("Thursday");
        } else if (numb1 ==5){
            System.out.println("Friday");
        } else if (numb1 ==6){
            System.out.println("Saturday");
        } else if (numb1 ==7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input");
        }
*/

     /*   Task 1 : use if else
        Ask user to enter an string “word”
        If the length of the word is between 1-5
        Print : Short word
        If the length of the word is between 5-10
        Print : Medium word
        If the length of the word is between 10-15
        Print : Long word
        If the length of the word is grater 15
        Print : Super long word
        If if the length of the word is one
        Print this is a char*/

        /*String wordFromUser = JOptionPane.showInputDialog
                ("Please enter any word");

        int wordLenght = wordFromUser.length();

        char dollarSign = '$';

        if (wordLenght > 1 && wordLenght < 5) {
            System.out.println("Short word");

        }else if (wordLenght >= 5 && wordLenght < 10) {
            System.out.println("Medium word");

        }else if (wordLenght >= 10 && wordLenght < 15) {
            System.out.println("Long word");

        }else if (wordLenght >= 15){
            System.out.println("Super long word");

        }else if (wordLenght == 1) {
            System.out.println(dollarSign);

        }else {
            System.out.println("Invalid input");
        }*/


        /* Task 2 : use if else
        Ask user to enter a chat
        If it’s uppercase
        Print : it’s uppercase char
        If it’s lower case
                Print it’s lowercase char
        If it’s not not a char letter
        Print it’s not a letter*/


   /*     System.out.println("Enter a char");

        char ch = input.nextLine().charAt(0);

      if (ch >= 65 && ch <= 90) {
          System.out.println("it’s uppercase char");

      }else if (ch >= 97 && ch <= 122) {
          System.out.println("it’s lowercase char");

      }else {
          System.out.println("it’s not a letter");
      }*/

   /*     Task 3 : use switch
        Ask user to enter char
        Write a program to check if it’s vowel ( there is 5 vowels in English- find out from Google)
        If it’s one of the vowels - no matter uppercase or lowercase print based on your program
        Example : if user enter A or a print : A or a is a vowel letter .
                If the input is not a vowel print
        This letter is not a vowel !
                If it’s anything else like @,&,) : print this is not a letter !


        System.out.println("Please enter a char");
        char ch = input.nextLine().charAt(0);

        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'O':
                    System.out.println(ch + " is a vowel letter");
                    break;

                default:
                    System.out.println (ch + " is not a vowel");

            }

        }else {
            System.out.println ( "this is not a letter");
        }*/


      /*  Task 4:
        Create a random number between 0-100
        Write a program to check :
        If the number is between 0-5
        Print your a baby
        If the number is between 5-12
        Print your a little child :child:
        If the number is between 13-19
        Print your are a teenager
        If the number is between 20-50
        Print your are an adult :man:
        If number grater > 65
        Print your a senior person*/

       /* Random number = new Random();

        int randomNumber = number.nextInt(100);

        if (randomNumber > 0 && randomNumber <= 5) {
            System.out.println("your a baby");

        }else if (randomNumber > 5 && randomNumber <= 12) {
            System.out.println("your a little child");

        }else if (randomNumber > 12 && randomNumber <= 19) {
            System.out.println("your are a teenager");

        }else if (randomNumber > 19 && randomNumber <= 50) {
            System.out.println("your are an adult");

        }else if (randomNumber > 50 ) {
            System.out.println("your a senior person");

        }*/
        /*int i=1;
        while (i<=6){
            System.out.println("enter your number");
            int num=input.nextInt();
            num++;
            System.out.println(num+num);
            i++;
        }
*/
        int num = 3;
        while (num <= 6) {
            if (num % 2 == 1) {
                // System.out.println(num);
                num++;
            }
            System.out.println(num);
            num += 2;

        }


    }
}