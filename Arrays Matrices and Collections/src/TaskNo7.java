import java.util.Scanner;

/*
* Write a Java program that completes a vector A with n integers read
* from the keyboard and calculates the product of odd values on the even positions
*  and the sum of even values on the odd positions.
* */
public class TaskNo7 {
    static void EvenOddProduct(int arr[], int n)
    {
        int even = 1;
        int odd = 1;

        for (int i = 0; i < n; i++) {

            // Loop to find even, odd product
            if (i % 2 == 0)
                even *= arr[i];
            else
                odd *= arr[i];
        }

        System.out.println("Even Index Product : " + even);
        System.out.println("Odd Index Product : " + odd);
    }
    static void EvenOddSum(int arr[], int n)
    {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {

            // Loop to find even, odd product
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }

        System.out.println("Even Index Sum : " + even);
        System.out.println("Odd Index Sum : " + odd);
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


        EvenOddProduct(myArray, myArray.length);
        EvenOddSum(myArray, myArray.length);
    }
}
