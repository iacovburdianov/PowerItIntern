import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 4/10/2023
 *
 * @author : Admin
 * @date : 4/10/2023
 * @project : Arrays Matrices and Collections
 */


/*
* Creates an array A with n rows and m columns (m <= 30, n <= 30) with integer elements.
* Write a Java program that replaces the rows that contain the maximum and minimum element.
* */
public class TaskNo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N rows: ");
        int rowSize = scanner.nextInt();

        System.out.println("Input M colons: ");
        int colSize = scanner.nextInt();

        int[][] myArray = new int[rowSize][colSize];
        System.out.println("Input elements: ");
        for (int i = 0; i < rowSize ; i++) {
            for (int j = 0; j < colSize; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0;i < rowSize;i++)
        {
            for(int j = 0;j < colSize;j++)
            {
                if(myArray[i][j] <= min)
                    min = myArray[i][j];
            }
        }

    }
}
