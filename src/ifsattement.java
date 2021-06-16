import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;
import javax.print.attribute.standard.JobPriority;
import javax.swing.JOptionPane;
public class ifsattement {
    public static void main(String[] args) {

    /*    if (4>7){
            System.out.println("true");
        } else if (4>3){
            System.out.println("Else if run");
        } else {
            System.out.println("Else run if all condition false");
        }
*/

    /*    Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();

        System.out.println("enter second number");
        int num2 = input.nextInt();

        if (num1 > num2)  {
            System.out.println("First number is bigger");
        }else if (num2 > num1) {
            System.out.println("Second number is larger");
        }else if (num1 == num2 && num2 == num1){
            System.out.println("Number are equal");
        }else {
            System.out.println("Wrong input");
        }
*/

        Scanner input = new Scanner(System.in);
     /*   System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter the third number");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("First number bigger");

        }else if (num1 == num2 && num1 > num3) {
            System.out.println("First and second numbers are bigger");

        }else if (num1 == num3 && num1 > num2) {
            System.out.println("First and third numbers are bigger");

        }else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number bigger");

        }else if (num2 == num3 && num2 > num1){
            System.out.println("Second and third numbers are bigger");

        }else if (num3 > num1 && num3 > num2) {
            System.out.println("Third number " +num3+" bigger");

        }else {
            System.out.println("Wrong input");
        }
*/

        // Ask user to enter 2 number
        // ask user to enter char(-,+,*,/)

      /*  System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Please enter the sign for mathematical operation you want to do");
        char x = input.next().charAt(0);

        if (x == '+'){
            System.out.println(num1 + num2);

        }else if (x == '-'){
            System.out.println(num1 - num2);

        }else if (x == '*'){
            System.out.println(num1 * num2);

        }else if (x == '/'){
            System.out.println(num1 / num2);

        }else {
            System.out.println("Wrong input");
        }
*/
    /* String userName = "ABC123";
     String passWord  = "xyz2021";

        String userNameFromUser = JOptionPane.showInputDialog
                ("Please enter yor user name");
        String passWordFromUser = JOptionPane.showInputDialog
                ("Please enter your password");

        if (userNameFromUser.equals(userName)) {
            System.out.println("Correct username");

                if (passWord.equals(passWord)){

                    System.out.println("You are logged in");
                }else{
                    System.out.println("Invalid user name");
                }

        }else {
            System.out.println("Invalid user name");
        }*/

       /* System.out.println("Enter number ");
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

/*

        String day = JOptionPane.showInputDialog("Enter today day");

        if (day.equals("Monday")){
            System.out.println("1");

        } else if (day.equals("Tuesday")){
            System.out.println("2");

        } else if (day.equals("Wednesday")){
            System.out.println("3");

        } else if (day.equals("Thursday")){
            System.out.println("4");

        } else if (day.equals("Friday")){
            System.out.println("5");

        } else if (day.equals("Saturday")){
            System.out.println("6");

        } else if (day.equals("Sunday")){
            System.out.println("7");

        } else {
            System.out.println("Invalid input");
        }
*/

          String userName = JOptionPane.showInputDialog
                  ("Create user name") ;
          String passWord  = JOptionPane.showInputDialog
                  ("Create password");

          String userNameFromUser = JOptionPane.showInputDialog
                  ("Please enter user name");
          String passWordNameFromUser = JOptionPane.showInputDialog
                  ("please enter the password");

          if (userName.equals(userNameFromUser) && passWord.equals(passWordNameFromUser)) {
              System.out.println("You successful lodged in");

          }else {
              System.out.println("Incorrect user name or password");
              System.out.println("Try again");
          }




    }
}
