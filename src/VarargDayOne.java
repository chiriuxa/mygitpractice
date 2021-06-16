import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class VarargDayOne {


  public static void main(String[] args) {


    Utils x = new Utils();

    int result = x.add3Nums(3, 4, 5);

    int result1 = x.addNums(76767, 45, 876756, 6677676);

    System.out.println(result1);

    LocalDate date = LocalDate.now();


    LocalTime time = LocalTime.now();


    System.out.println(date +" "+ time);

  }
}

