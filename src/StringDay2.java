import java.sql.SQLOutput;

public class StringDay2 {
    public static void main(String[] args) {

//        StringBuilder text = new StringBuilder("Hello");
//
//
//        String text2 = " World";

       /* text.append(text2);
        text.append(" !").append(" cool").append(" !!!");*/

//        text.deleteCharAt(2).deleteCharAt(0);
//        System.out.println(text);
//

//        StringBuilder calleName = new StringBuilder("Kiril");
//
//        calleName.append(" ").append("Smirnoff");
//
//        calleName.deleteCharAt(0).deleteCharAt(5);
//
//        System.out.println(calleName);
//
//        calleName.reverse();
//
//        String str = calleName.toString();

       // StringBuilder str1 = new StringBuilder(str);

       // System.out.println(str.toUpperCase());
/*
        String abc = "ABC";

        StringBuilder abc1 = new StringBuilder(abc);

        abc1.reverse();
        System.out.println(abc);
        System.out.println(abc1);

        abc1.insert(0, "kiril ");
        System.out.println(abc1);*/
        String myName1 = "Kiril";
        StringBuilder myName = new StringBuilder(myName1);

        StringBuilder myLastname = new StringBuilder(" Cojuhari");

        myLastname.reverse();
        myLastname.reverse();
        myName.append(myLastname);
        System.out.println(myName);





    }
}
