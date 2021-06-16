package HomeWork;

import javax.swing.*;
import javax.print.attribute.standard.JobPriority;
import javax.swing.JOptionPane;
public class HwGradeScore {
    public static void main(String[] args) {

        String math = JOptionPane.showInputDialog
                ("Please enter subject name number 1");
        double mathScore = Double.parseDouble(JOptionPane.showInputDialog
                ("Please score for this subject:"));

        String biology = JOptionPane.showInputDialog
                ("Please enter subject name number 2");
        double biologyScore = Double.parseDouble(JOptionPane.showInputDialog
                ("Please enter score for subject number 2:"));

        String english = JOptionPane.showInputDialog
                ("Please enter subject name number 3");
        double englishScore = Double.parseDouble(JOptionPane.showInputDialog
                ("Please enter score for subject number 3:"));

        String chemistry = JOptionPane.showInputDialog
                ("Please enter subject name number 4");
        double chemistryScore = Double.parseDouble(JOptionPane.showInputDialog
                ("Please enter score for subject number 4"));

        String music = JOptionPane.showInputDialog
                ("Please enter subject name number 5");
        double musicScore = Double.parseDouble(JOptionPane.showInputDialog
                ("Please enter score for subject number 5"));

        char sign = '-';
        char comma = ',';

        String summary = ("Summary : " + math + sign + mathScore + comma + biology + sign + biologyScore +
                comma + english + sign + englishScore + comma + chemistry + sign + chemistryScore + comma +
                music + sign + musicScore);

        double average = (mathScore + biologyScore + englishScore + chemistryScore + musicScore) / 5;
        String myName = "Kiril";


        System.out.println(summary);
        System.out.println("Your average score is : " + average);
        System.out.println("Thank you for using Grade Java Program from " + myName);
        System.out.println("Goodbye!");
    }
}

