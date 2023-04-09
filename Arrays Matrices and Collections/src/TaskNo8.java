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
* Write a Java program that completes a vector
* A with n real numbers and modifies the content of the given vector as follows:
* to all values on even positions the first element is added,
* and to those on odd positions - the last.
* The first and last items remain unchanged.
* */
public class TaskNo8 {
    static void add(int arr[], int n) {
        for (int i = 1; i < n-1; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + arr[0];
            } else {
                arr[i] = arr[i] + arr[n-2];
            }
        }
        System.out.println(Arrays.toString(arr));
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

        add(myArray,myArray.length);
    }
}
