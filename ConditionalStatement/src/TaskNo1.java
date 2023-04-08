import java.util.Scanner;


/*
* Write a Java program to get a number from the user
* and print whether it is positive or negative.

* TestData: -38
* Expected Output: negative number
* */
public class TaskNo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        long number = scanner.nextLong();
        if (number >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
}
