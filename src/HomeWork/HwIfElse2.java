package HomeWork;

import javax.swing.*;

public class HwIfElse2 {
    public static void main(String[] args) {




        /*String day = JOptionPane.showInputDialog("Enter today day");

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
/*
        HOME WORK: HTTP is the protocol that governs communications between servers and web
        clients (i.e. browsers). Part of the protocol includes a
        status code returned by the
        server to tell the browser the status of its most recent page request. Some of the
        codes and their meanings are listed below:
        STATUS CODES
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable
        if invalid number : Print: “Invalid status code”*/

        int returnedCod = Integer.parseInt(JOptionPane.showInputDialog
                ("Enter the cod"));

        int cod1 = 200, cod2 = 201, cod3= 202, cod4= 301, cod5= 303, cod6=304,
                cod7= 307, cod8= 400, cod9= 401, cod10= 403, cod11= 500, cod12=410,
                cod13= 500, cod14= 503;

        if (returnedCod == cod1) {
            System.out.println("OK");

        }else if (returnedCod == cod2) {
            System.out.println("Created");

        }else if (returnedCod == cod3) {
            System.out.println("Accepted");

        }else if (returnedCod == cod4) {
            System.out.println("Moved Permanently");

        }else if (returnedCod == cod5) {
            System.out.println("See Other");

        }else if (returnedCod == cod6) {
            System.out.println("Not Modified");

        }else if (returnedCod == cod7) {
            System.out.println("Temporary Redirect");

        }else if (returnedCod == cod8) {
            System.out.println("Bad Request");

        }else if (returnedCod == cod9) {
            System.out.println("Unauthorized");

        }else if (returnedCod == cod10) {
            System.out.println("Forbidden");

        }else if (returnedCod == cod11) {
            System.out.println("Not Found");

        }else if (returnedCod == cod12) {
            System.out.println("Gone");

        }else if (returnedCod == cod13) {
            System.out.println("Internal Server Error");

        }else if (returnedCod == cod14) {
            System.out.println("Service Unavailable");

        }else {
            System.out.println("Invalid status code");
        }




    }
}
