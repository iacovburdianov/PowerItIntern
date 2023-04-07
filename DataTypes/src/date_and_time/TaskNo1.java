package date_and_time;

import java.util.Calendar;
/*
* Write a Java program to get the value of year,
* month, week, date from the current date of a default calendar.
* */

/*
* Current Date and Time:Mon Jun 13 13:26:18 GMT 2022
* Actual Year: 2022
* Actual Month: 6
* Actual Week of Year: 25
* Actual Date: 13
* */
public class TaskNo1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();
        System.out.println("Actual Year: " + cal.get(Calendar.YEAR));
        System.out.println("Actual Month: " + cal.get(Calendar.MONTH));
        System.out.println("Week of Year: " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Date: " + cal.get(Calendar.DATE));

    }
}
