package string;

import java.util.Scanner;

public class TaskNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String inputString = scanner.nextLine();
        System.out.println("The character at position 0 is: '" + inputString.charAt(0)+"'");
        System.out.println("The character at position 10 is: '" + inputString.charAt(10)+"'");
    }
}
