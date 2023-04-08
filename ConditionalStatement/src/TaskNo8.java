/*
*Write a program that enters the current date (day, month, year).
* Determine the date of the next day.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskNo8 {
    public static LocalDate findNextDay(LocalDate localdate)
    {
        return localdate.plusDays(1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a day number: ");
        int day = scanner.nextInt();
        System.out.println("Input a month number: ");
        int month = scanner.nextInt();
        System.out.println("Input a year:");
        int year = scanner.nextInt();

        System.out.println(day + "." + month + "." + year);
        LocalDate nextDay = findNextDay(LocalDate.of(year,month,day));

        System.out.println("The date of the next day is: " + nextDay);
    }
}
