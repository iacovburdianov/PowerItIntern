import java.util.Scanner;

/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : FileIO
 */
public class TaskNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String surName, firstName;
        System.out.println("Input your name: ");
        surName = scanner.nextLine();
        System.out.println("Input your first name: ");
        firstName = scanner.nextLine();
        System.out.println("Your name is: " + surName + "\nYour first name is: " + firstName);

    }
}
