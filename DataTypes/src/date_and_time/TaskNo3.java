package date_and_time;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TaskNo3 {
    public static void main(String[] args) {
        //Date/Calendar case: Wed Jan 01 13:51:16 GMT 2020 <-> Tue Mar 01 13:51:16 GMT 2022
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, 1, 1);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2022, 3, 1);
        System.out.println("\nDate/Calendar case: " + cal1.getTime() + " <-> " + cal2.getTime());
        long inMs = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());
        long inDays = Math.abs(TimeUnit.DAYS.convert(inMs, TimeUnit.MILLISECONDS));
        System.out.println("Difference in milliseconds is: " + inMs);
        System.out.println("Difference in days is: " + inDays);

        //LocalDate case: 2020-01-01 <-> 2022-03-01
        LocalDate localDate1 = LocalDate.of(2020,1,1);
        LocalDate localDate2 = LocalDate.of(2022,3,1);
        System.out.println("\nLocalDate case: " + localDate1 + " <-> " + localDate2);
        Period diffAsPeriod  = Period.between(localDate1,localDate2);
        //Difference as Period:
        Period period = localDate1.until(localDate2);
        System.out.println("Difference as Period: "
                + period.getYears() + "y" + period.getMonths() + "m" + period.getDays() + "d");
        //Difference in days is via between():
        long diffInDaysViaBetween = Math.abs(ChronoUnit.DAYS.between(localDate1,localDate2));
        System.out.println("Difference in days is via between(): " + diffInDaysViaBetween);
        //Difference in months is via between():
        long diffInMonthsViaBetween = Math.abs(ChronoUnit.MONTHS.between(localDate1,localDate2));
        System.out.println("Difference in months is via between(): " + diffInMonthsViaBetween);
        //Difference in years is via between():
        long diffInYearsViaBetween = Math.abs(ChronoUnit.YEARS.between(localDate1,localDate2));
        System.out.println("Difference in years is via between(): " + diffInYearsViaBetween);
        //Difference in days is via until():
        long diffInDaysViaUntil = Math.abs(localDate1.until(localDate2, ChronoUnit.DAYS));
        System.out.println("Difference in days is via until(): " + diffInDaysViaUntil);
        //Difference in months is via until():
        long diffInMonthsViaUntil = Math.abs(localDate1.until(localDate2, ChronoUnit.MONTHS));
        System.out.println("Difference in months is via until(): " + diffInMonthsViaUntil);
        //Difference in years is via until():
        long diffInYearsViaUntil = Math.abs(localDate1.until(localDate2, ChronoUnit.YEARS));


        //LocalDateTime case: 2020-01-01 <-> 2022-03-01
        LocalDateTime ldt1 = LocalDateTime.of(2020, 1, 1, 22, 15, 15);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 1, 1, 23, 15, 15);
        System.out.println("\nLocalDateTime case: " + ldt1 + " <-> " + ldt2);
        long betweenInMinutesWithoutZone = Math.abs(ChronoUnit.MINUTES.between(ldt1, ldt2));
        long untilInMinutesWithoutZone = Math.abs(ldt1.until(ldt2, ChronoUnit.HOURS));
        System.out.println("Difference in minutes without zone: " + betweenInMinutesWithoutZone);
        System.out.println("Difference in hours without zone: " + untilInMinutesWithoutZone);

    }
}
