import java.util.Arrays;

/**
 * Created by Admin on 4/12/2023
 *
 * @author : Admin
 * @date : 4/12/2023
 * @project : Modifiers In Java
 */
public class TaskNo9 {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {{1,2,3},{11,22,33},{111,222,333}};
        int[][] matrix2 = new int[][] {{1,2,3},{11,22,33},{111,222,333}};
        Matrix.rowAtPosition(matrix1,1);
        System.out.println("\n");
        Matrix.itemAtPosition(matrix1,2,2);
        System.out.println("\n");
        Matrix.colonAtPosition(matrix1,2);
        System.out.println("\n");
        System.out.println(Arrays.deepToString(Matrix.sumTwoMatrix(matrix1, matrix2, matrix1.length)));
        System.out.println("\n");
        Matrix.multiplyMatrix(3,3,matrix1,
                                    3,3,matrix2);
        System.out.println("\n");
        Matrix.scalarMultiplication(matrix2,3);

    }
}

class Matrix {
    int[] oneDimMatrix;
    int[][] twoDimMatrix;

    public Matrix() {
    }

    public Matrix(int[] oneDimMatrix) {
        this.oneDimMatrix = oneDimMatrix;
    }

    public Matrix(int[][] twoDimMatrix) {
        this.twoDimMatrix = twoDimMatrix;
    }

    public static int[][] sumTwoMatrix(int[][] A, int[][] B, int size) {
        int i, j;
        int C[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    static void printMatrix(int M[][], int rowSize, int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static void multiplyMatrix(
            int row1, int col1, int A[][],
            int row2, int col2, int B[][])
    {
        int i, j, k;

        // Print the matrices A and B
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);

        // Check if multiplication is Possible
        if (row2 != col1) {

            System.out.println(
                    "\nMultiplication Not Possible");
            return;
        }

        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int C[][] = new int[row1][col2];

        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }

    public static void scalarMultiplication(int[][] twoDimMatrix,
                                               int multiplValue) {
        int i,j;
        for(i = 0; i < twoDimMatrix.length ; i++)
        {
            for(j = 0; j < twoDimMatrix[0].length; j++)
            {
                System.out.format("%d \t", (multiplValue * twoDimMatrix[i][j]));
            }
            System.out.print("\n");
        }
    }

    public static void itemAtPosition(int[] oneDimMatrix,int rowPos) {
        try {
            System.out.println(oneDimMatrix[rowPos]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    public static void itemAtPosition(int[][] twoDimMatrix,int rowPos, int colonPos) {
        try {
            System.out.println(twoDimMatrix[rowPos][colonPos]);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void rowAtPosition(int[][] twoDimMatrix,int pos) {
        try {
            System.out.print("[");
            for (int i = 0; i < twoDimMatrix[pos].length; i++) {
                System.out.print(twoDimMatrix[pos][i] + " ");
            }
            System.out.print("]");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    public static void colonAtPosition(int[][] twoDimMatrix,int pos) {
        try {
            System.out.println("[");
            for (int i = 0; i < twoDimMatrix.length; i++) {
                System.out.println(twoDimMatrix[i][pos] + " ");
            }
            System.out.println("]");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
