/*
*Given an integer n, perform the following conditional actions:
* If n is odd, print “Weird”
* If n is even and in the inclusive range of 2 to 5, print “Not Weird”
* If n is even and in the inclusive range of 6 to 20, print “Weird”
* If n is even and greater than 20, print “Not Weird”
*/

import java.util.Scanner;

public class TaskNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number: ");
        int number = in.nextInt();
        if(number < 2) {
            System.out.println("Weird");
        }
        if(number >= 2) {
            if (number > 20) {
                System.out.println("Not Weird");
            }
            if (number >=6) {
                if (number <=20){
                    System.out.println("Weird");
                }
            }
            if (number <= 5) {
                System.out.println("Not Weird");
            }
        }
    }
}
