import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 4/9/2023
 *
 * @author : Admin
 * @date : 4/9/2023
 * @project : Arrays Matrices and Collections
 */


/*Write a Java program that completes an array A with n integers
* and forms two other arrays B and C, where the first vector B will contain only even components from A,
* and the second array C only odd components.*/
public class TaskNo10 {
    public static void printTwoArrays(int[] array, int n){
        //count even and odd elements in an array
        int evenCount=0, oddCount=0;
        for(int i = 0; i < array.length;i++){
            if(array[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];
        int e = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0){
                evenArr[e] = array[i];
                e++;
            } else {
                oddArr[o] = array[i];
                o++;
            }
        }
        System.out.println("Array B with even components" + Arrays.toString(evenArr));
        System.out.println("Array C with odd components" + Arrays.toString(oddArr));
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

        printTwoArrays(myArray,myArray.length);
    }
}
