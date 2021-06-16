import java.util.*;
import javax.print.attribute.standard.JobPriority;
import javax.swing.JOptionPane;

public class usefulljavamethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  /*      // lenght() ==>find out how many characters in string
        String name = "hello ";
        name = "Jack Bower";
        name = "Chiril Gherciu";
        int myNameSize = name.length();
        System.out.println(myNameSize);

        // toUpperCase ()==> converts all string to upper case
        String text = "abcJJKoik";
        System.out.println(text.toUpperCase());

        // toLowerCase() ==> convert string to lower case
        String text1 = "QWERTThjhjkHJKKik";
        System.out.println(text1.toLowerCase());*/
/*
        //equals()==> comprisese 2 string together ,returns boolean
        String txt = "ABCd";
        String txt1 = "ABC";
        boolean result = txt.equals(txt1);
        System.out.println(result);
        System.out.println(txt.equals(txt1));
        String x = "Apple";
        String y = "Apple";
        boolean res =x.equals(y);
        System.out.println(res);
        //System.out.println(x==y);*/
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word : HELLO ");
        String HELLO1 = input.nextLine();
        System.out.println(HELLO1.toLowerCase());

        System.out.println("Please enter the word : hello ");
        String hello = input.nextLine();
        System.out.println(hello.toUpperCase());*/

        //parseInt() ==> convert a string to int
/*
        String number = "10";
        int valuOfNumber = Integer.parseInt(number);
        double valOfDabl = Double.parseDouble(number);

        System.out.println(number+1);
        System.out.println(valuOfNumber+1);
        System.out.println(valOfDabl+10);*/


       /* System.out.println("Please enter number between -19 and 21- : ");
        String number1 = input.next();
        double doubleNumber = Double.parseDouble(number1);
        double doubleNum1 = doubleNumber +10.10;
        System.out.println("Your number is : " + doubleNum1);*/
/*
        System.out.println("Please enter number between -19 and 21- : ");
        String number1 = input.next();
        double doubleNumber = Double.parseDouble(number1);
        doubleNumber += 10.10;
        System.out.println("Your number is : " + doubleNumber);*/

       /* //Shopping list
        //Apples, Tomatoes, Sugar, Coffer, Potato, Orange, Milk, Bread, Eggs.
        char dollarSign = '$';
        System.out.println("please enter item : ");
        String item1 = input.next();
        System.out.println("please enter Price : ");
        double price1 = input.nextDouble();
        System.out.println("Item : " + item1 +  " Price is : " + price1 + dollarSign);
        System.out.println("please enter next item : ");
        String item2 = input.next();
        System.out.println("please enter next item price : ");
        double price2 = input.nextDouble();
        System.out.println("Item : " + item2 +  " Price is : " + price2 + dollarSign);
        System.out.println("please enter next item: ");
        String item3 = input.next();
        System.out.println("please enter next item price : ");
        double price3 = input.nextDouble();
        System.out.println("Item : " + item3 +  " Price is : " + price3 + dollarSign);
        System.out.println("please enter next item : ");
        String item4 = input.next();
        System.out.println("please enter next item price : ");
        double price4 = input.nextDouble();
        System.out.println("Item : " + item4 +  " Price is : " + price4 + dollarSign);
        System.out.println("please enter next item : ");
        String item5 = input.next();
        System.out.println("please enter next item price : ");
        double price5 = input.nextDouble();
        System.out.println("Item : " + item5 +  " Price is : " + price5 + dollarSign);
        System.out.println("please enter next item : ");
        String item6 = input.next();
        System.out.println("please enter next item price : ");
        double price6 = input.nextDouble();
        System.out.println("Item : " + item6 +  " Price is : " + price6 + dollarSign);
        System.out.println("please enter next item : ");
        String item7 = input.next();
        System.out.println("please enter next item price : ");
        double price7 = input.nextDouble();
        System.out.println("Item : " + item7 +  " Price is : " + price7 + dollarSign);
        System.out.println("please enter next item : ");
        String item8 = input.next();
        System.out.println("please enter next item price : ");
        double price8 = input.nextDouble();
        System.out.println("Item : " + item8 +  " Price is : " + price8 + dollarSign);
        System.out.println("please enter next item : ");
        String item9 = input.next();
        System.out.println("please enter next item price : ");
        double price9 = input.nextDouble();
        System.out.println("Item : " + item9 +  " Price is : " + price9 + dollarSign);
        double total = price1 + price2 + price3 + price4 +price5 +price6+price7+price8+price9;
        System.out.println("Total is : "+total+dollarSign);
*/
   /*     // How to get dialog box from java - asking user
        String name =JOptionPane.showInputDialog("Enter your name");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        System.out.println(name + " you are " + num);*/

     /*   char dollarSign = '$';
        String item1 =JOptionPane.showInputDialog("Enter your item");
        double price1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter next item price "));
        System.out.println("Produce " + item1 + " paid " + price1 + dollarSign);

        String item2 =JOptionPane.showInputDialog("Enter your next item");
        double price2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter next item price "));
        System.out.println("Produce " + item2 + " paid " + price2 + dollarSign);

        String item3 =JOptionPane.showInputDialog("Enter your next item");
        double price3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter next item price "));
        System.out.println("Produce " + item3 + " paid " + price3 + dollarSign);

        double total1 = price1+price2+price3;

        String name =  JOptionPane.showInputDialog("Enter your name");
        String lastName = JOptionPane.showInputDialog("Enter your last name");
        byte age = Byte.parseByte(JOptionPane.showInputDialog("Enter your age"));
        String place = JOptionPane.showInputDialog("Enter your favorite place to visit");

        System.out.println("My name is : "+name+" "+lastName);
        System.out.println("My age is : "+age);
        System.out.println("My favorite place to visit is : " +place); System.out.println("Total : " +total1+dollarSign);*/
/**/

//Ask user to enter year of birth and calculate his age
      /*  int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter your year of birth"));
        int currentYear = 2021;
        int output = currentYear - yearOfBirth;
        System.out.println("You are " + output+" years old");*/

       /* int income1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your monthly income"));
        int numberOfMonths = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of working months"));
        int totalIncome =income1*numberOfMonths;

        System.out.println(totalIncome);*/
/*
        String Java = JOptionPane.showInputDialog("Enter world : Java");
        String TNS = JOptionPane.showInputDialog("Enter : 'Tech Nova School'");
        System.out.println("I am learning " + Java + " in " + TNS);*/










    }
}
