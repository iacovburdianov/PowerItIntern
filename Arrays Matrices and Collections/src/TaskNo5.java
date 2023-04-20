import java.util.Arrays;

/*Write a Java program to find the maximum and minimum value and index of an array.*/
public class TaskNo5 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 9, 1};
        int[] result = findMaxMin(arr);
        System.out.println("Maximum value is " + result[0] + " and its index is " + result[1]);
        System.out.println("Minimum value is " + result[2] + " and its index is " + result[3]);
    }

    public static int[] findMaxMin(int[] arr) {
        int[] result = new int[4];
        int maxVal = arr[0];
        int minVal = arr[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxIndex = i;
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }

        result[0] = maxVal;
        result[1] = maxIndex;
        result[2] = minVal;
        result[3] = minIndex;

        return result;
    }
}

