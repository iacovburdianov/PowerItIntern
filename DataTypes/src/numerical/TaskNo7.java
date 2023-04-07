package numerical;

import java.util.Scanner;

public class TaskNo7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ammount of money:");
        double principal = scanner.nextDouble();
        System.out.println("Input rate:");
        double rate = scanner.nextDouble();
        System.out.println("Input time");
        double time = scanner.nextDouble();

        /* Calculate compound interest */
        double CI = principal *
                (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is "+ CI);
    }
}
