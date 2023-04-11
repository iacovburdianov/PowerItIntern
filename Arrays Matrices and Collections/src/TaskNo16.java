import java.util.Scanner;

/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : Arrays Matrices and Collections
 */

/*Write a Java program which reverses: [1,2,3,4].*/
public class TaskNo16 {

    //Using Temp array
    // function that reverses array and stores it
    // in another array
    static void reverseUsingTempArray(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array using Temporary Array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + "  ");
        }
    }

    //Using Swapping
    static void reverseBySwapping(int a[], int n)
    {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        // printing the reversed array
        System.out.println("Reversed array using Swapping is: \n");
        for (k = 0; k < n; k++) {
            System.out.print(a[k] + "  ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of the array: ");
        int n = scanner.nextInt();
        System.out.println("Input elements of the array: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        reverseUsingTempArray(array,n);
        System.out.println("***************8");
        reverseBySwapping(array,n);
    }
}
