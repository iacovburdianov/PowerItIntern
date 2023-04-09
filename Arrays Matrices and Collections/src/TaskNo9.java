import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 4/9/2023
 *
 * @author : Admin
 * @date : 4/9/2023
 * @project : Arrays Matrices and Collections
 */


/*
* Write a Java program that completes an array A with n natural numbers
* and orders the first half ascending and descending the second half of the attay.
* The program displays the obtained vector on the screen.
* */
public class TaskNo9 {
    static void printOrder(int[] arr, int n)
    {
        // sorting the array
        Arrays.sort(arr);

        // printing first half in ascending
        // order
        for (int i = 0; i < n / 2; i++)
            System.out.print(arr[i]+" ");

        // printing second half in descending
        // order
        for (int j = n - 1; j >= n / 2; j--)
            System.out.print(arr[j]+" ");

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }

        printOrder(myArray, length);
    }
}
