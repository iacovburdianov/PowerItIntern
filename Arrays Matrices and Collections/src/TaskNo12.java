import java.util.Scanner;

/**
 * Created by Admin on 4/9/2023
 *
 * @author : Admin
 * @date : 4/9/2023
 * @project : Arrays Matrices and Collections
 */
/*
* Write a Java program, Reading a square matrix A of size nxn with integer elements.
* Write a program that calculates and shows:
* the sum of the elements above the main diagonal;
* the sum of the elements below the secondary diagonal.
* */
public class TaskNo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");
        //rows and columns in matrix must be same.
        int rows = scanner.nextInt();
        int columns = rows;
        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the elements in matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Logic to calculate sum of elements above diagonal.
        int sum = 0;
        for (int j = 1; j < columns; j++) {
            for (int i = j - 1; i >= 0 ; i--) {
                sum= sum + matrix[i][j];
            }
        }

        System.out.println("\nMatrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of elements above diagonal is: " + sum);


        //Logic to calculate sum of elements below diagonal.
        int sum1 = 0;
        for (int i = 1; i < rows; i++) {
            for (int j = i - 1 ; j >= 0 ; j--) {
                sum1 = sum1 + matrix[i][j];
            }

        }
        System.out.println("sum of elements below diagonal is: " + sum1);
    }
}
