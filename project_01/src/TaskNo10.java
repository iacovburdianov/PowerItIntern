import java.util.Scanner;

public class TaskNo10 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Number of years: ");
            long years = scan.nextLong();
            long months = years*12;
            long days = years*365;
            long hours = years*365*24;
            System.out.println(months + " months, " + days + " days, " + hours + " hours");
        }

}
