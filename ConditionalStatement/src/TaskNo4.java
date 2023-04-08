import java.util.Arrays;
import java.util.Scanner;


/*
*
* Write a program that reads from the keyboard
* three numeric values n1, n2, n3
* and then displays on the screen the biggest difference between any two given values.
*
* TestData: n1 = 100
*        n2 = 15
*          n3 = 105
* Expected Output: 90
* */
public class TaskNo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int[] arr = {num1,num2,num3};
        int n = arr.length;
        System.out.print(maxAbsDiff(arr, n));
    }
    static int maxAbsDiff(int arr[], int n)
    {

        // Sorting the array
        Arrays.sort(arr);

        // returning the difference between last and first element
        return arr[n-1] - arr[0];
    }
}
