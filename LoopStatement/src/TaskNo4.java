import java.io.IOException;
import java.util.Scanner;

/*
* Enter 10 integers from the keypad. Write a program that determines and displays:
*
*  sum of the positives numbers;
*  arithmetic mean of the negative numbers;*/
public class TaskNo4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 10;i++) {
            System.out.print("Enter number "+(i+1)+ " =");
            a[i] = input.nextInt();
        }

        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0;i < a.length;i++) {
            if (a[i] > 0) {
                positiveSum += a[i];
            } else {
                negativeSum -= a[i];
            }
        }
        System.out.println("Sum = " + positiveSum);
        System.out.println("Arithmetic mean = " + negativeSum);
    }
}
