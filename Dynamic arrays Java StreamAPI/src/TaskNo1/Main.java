package TaskNo1;

import org.w3c.dom.Node;

import java.util.List;

/**
 * Created by Admin on 4/19/2023
 *
 * @author : Admin
 * @date : 4/19/2023
 * @project : Dynamic arrays Java StreamAPI
 */
public class Main {
    public static boolean isListOrdered(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /*
    recursive Approach
    HOW to use binarySearchRecursive
    int[] arr = {1, 3, 5, 7, 9, 11};
    int target = 7;
    int index = binarySearchRecursive(arr, target, 0, arr.length - 1);
    if (index >= 0) {
        System.out.println("Target found at index " + index);
    } else {
        System.out.println("Target not found");
    }
    */
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // target not found in array
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid; // target found at index mid
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // search right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // search left half
        }
    }
    //iterative Approach
    /*
    * How to use:
    * int[] arr = {1, 3, 5, 7, 9, 11};
    * int target = 7;
    * int index = linearSearchIterative(arr, target);
    * if (index >= 0) {
    *    System.out.println("Target found at index " + index);
    * } else {
    *     System.out.println("Target not found");
    * }
    * */
    public static int linearSearchIterative(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // target found at index i
            }
        }
        return -1; // target not found in array
    }

    public static void insertInOrder(List<Integer> list, int newElement) {
        int i = 0;
        while (i < list.size() && list.get(i) < newElement) {
            i++;
        }
        list.add(i, newElement);
    }
    /*
    How to use:
    * List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
    * int newElement = 4;
    * insertInOrder(list, newElement);
    * System.out.println(list); // prints [1, 3, 4, 5, 7, 9]
    */



    //method that delete a given element in a java list of integers
    public static List<Integer> deleteElement(List<Integer> list, int elementToDelete) {
        list.remove(Integer.valueOf(elementToDelete));
        return list;
    }

}
