import java.util.Scanner;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */

/*
* Write a Java method with a single parameter k - a natural number of at least 3 digits
* and at most 7 digits, with all non-zero digits,
*  displays the value obtained by removing the first and last digit of the number
* transmitted in the call.*/
public class TaskNo4 {
    public static void firstAndLastDigitDeleter(int num) {
        int quotient;
        int firstDigit;

        if ((num > 99) && (num <= 9999999) && !(String.valueOf(num).contains("0"))) {
            firstDigit = Integer.parseInt(Integer.toString(num).substring(1));
            quotient = firstDigit / 10;
            System.out.println("The number without first and last digit: " + quotient);
        } else {
            System.out.println("Introduced an incorect number...");
        }


    }

    public static void main(String[] args) {
        //firstAndLastDigitDeleter(123453);
        firstAndLastDigitDeleter(123);
    }
}
