/**
 * Created by Admin on 4/11/2023
 *
 * @author : Admin
 * @date : 4/11/2023
 * @project : Arrays Matrices and Collections
 */

/*
* Write a Java program which:

* adds in the start of an array a number
* adds in the end of an array a number
* adds in the middle of an array a number
* It is forbidden to use the ready functions and ArrayList.
* */
public class TaskNo17 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr2 = addElementInTheStartOfTheArray(arr,9);
        for (int i : arr2) {
            System.out.print(i + "  ");
        }

        System.out.println("\n");

        int[] arr3 = addElementInTheEndOfTheArray(arr,9);
        for (int i:arr3) {
            System.out.print(i + "  ");
        }

        System.out.println("\n");

        int[] arr4 = insertX(arr,9);
        for (int i : arr4) {
            System.out.print(i + "  ");
        }
    }

    public static int[] addElementInTheStartOfTheArray(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = element;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public static int[] addElementInTheEndOfTheArray(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        newArr[arr.length] = element;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    // Function to insert x in arr at position pos
    public static int[] insertX(int arr[], int x) {
        int pos = arr.length/2 + 1;
        int i;
        int n = arr.length;

        // create a new array of size n+1
        int newArr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newArr[i] = arr[i];
            else if (i == pos - 1)
                newArr[i] = x;
            else
                newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}
