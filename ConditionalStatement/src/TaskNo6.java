/*
* Write a program that reads an X number from exactly 3 digits and determines:
*
* if the sum of the digits of the number X represents a number of exactly 2 digits;
* if the sum of the digits of the number X represents a number of exactly 2 digits;
* if the product of the digits of the number X is greater than the number X itself;
* if the sum of the digits of the number X is divisible by the number Y.
* */

import java.util.Scanner;

public class TaskNo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a 3 digit number: ");
        int num = scanner.nextInt();
        int number = num;


        //if the product of the digits of the number X represents a number of exactly 3 digits;
        int sum = 0;
        while (number > 0) {
            sum = sum + number%10;
            number = number/10;
        }
        if (sum < 100) {
            if (sum > 9) {
                System.out.println("The sum of the digits of the " +
                         num + " number is exactly 2 digits: " + sum);
            }else {
                System.out.println("The sum of the digits of the " +
                        num + " number is less than 2 digits: " + sum);
            }
        }

        //if the product of the digits of the number X represents a number of exactly 3 digits;
        int product = getProduct(num);



        if (product < 1000) {
            if (product > 99) {
                System.out.println("The product of the digits of the " +
                        num + " number is exactly 3 digits: " + product);
            }else {
                System.out.println("The product of the digits of the " +
                        num + " number is less than 3 digits: " + product);
            }
        }
        //if the product of the digits of the number X is greater than the number X itself;
        if(product > num) {
            System.out.println("The product of the digits of the " + num +
                    " number is greater than the number itself. Product: " + product);
        }else {
            System.out.println("The product of the digits of the " + num +
                    " number is lower than the number itself. Product: " + product);
        }

        //if the sum of the digits of the number X is divisible by the number Y.

        if(isDivisibleBy7(num))
            System.out.println("the sum of the digits of the number " +
                    num + " is divisible by the number 7 for example.");
        else
            System.out.println("the sum of the digits of the number " +
                    num + " is not divisible by the number 7 for example.");


    }
    static int getProduct(int n)
    {
        int product = 1;

        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }

        return product;
    }

    static boolean isDivisibleBy7(int num)
    {
        // If number is negative, make it positive
        if( num < 0 )
            return isDivisibleBy7( -num );

        // Base cases
        if( num == 0 || num == 7 )
            return true;
        if( num < 10 )
            return false;

        // Recur for ( num / 10 - 2 * num % 10 )
        return isDivisibleBy7( num / 10 - 2 * ( num - num / 10 * 10 ) );
    }
}
