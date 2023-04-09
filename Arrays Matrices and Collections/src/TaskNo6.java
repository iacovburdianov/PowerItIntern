import java.util.LinkedHashSet;

/*Write a Java program to remove the duplicate elements of a given array
* and return the new length of the array.
* After removing the duplicate elements the program should return the new length of the array. */
public class TaskNo6 {
    // Function to remove duplicate from array
    public static void removeDuplicatesAndPrintLength(int[] a) {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
        System.out.print(set);
        System.out.println("\nNumber of elements in new array: " + set.size());
    }
    public static void main(String[] args) {
        int a[] = {5,2,6,8,6,7,5,2,8};

        // Function call
        removeDuplicatesAndPrintLength(a);
    }
}
