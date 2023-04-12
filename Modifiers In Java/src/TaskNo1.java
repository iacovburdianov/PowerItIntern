import java.util.Scanner;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */

/*Write a Java method to compute the average of three numbers. */
public class TaskNo1 {
    public static void averageOfThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        double firstN = scanner.nextDouble();
        System.out.println("Input second number:");
        double secondN = scanner.nextDouble();
        System.out.println("Input third number");
        double thirdN = scanner.nextDouble();

        double avg = (firstN + secondN + thirdN)/3;
        System.out.println("The average is " + avg);
    }

    public static void main(String[] args) {
        averageOfThreeNumbers();
    }
}
