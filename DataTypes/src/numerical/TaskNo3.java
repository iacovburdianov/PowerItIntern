package numerical;

import java.util.Scanner;

public class TaskNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters:");
        double distanceInMeters = scanner.nextInt();
        System.out.println("Input hour:");
        double hour = scanner.nextInt();
        System.out.println("Input minutes:");
        double minutes = scanner.nextInt();
        System.out.println("Input seconds:");
        double seconds = scanner.nextInt();

        double timeInSeconds = seconds + minutes*60 + hour*3600;
        double timeInHours = hour + minutes/60 + seconds/3600;

        double metersPerSecond = distanceInMeters/timeInSeconds;
        System.out.println("Your speed in meters/second is " + metersPerSecond);

        double kilometersPerHour = (distanceInMeters/1000)/timeInHours;
        System.out.println("Your speed in km/h is " + kilometersPerHour);

        double milesPerHour = (distanceInMeters/1609.344)/timeInHours;
        System.out.println("Your speed in miles/h is " + milesPerHour);
    }
}
