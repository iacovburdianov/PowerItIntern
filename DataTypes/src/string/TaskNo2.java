package string;

import java.util.Scanner;

public class TaskNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the string:");
        String theInitialString = scanner.nextLine();
        String newSubstractedString = theInitialString.substring(4,14);
        System.out.println("New substring subtracted from the initial String" +
                " from 4 to 14 position: <" + newSubstractedString + ">");
    }
}
