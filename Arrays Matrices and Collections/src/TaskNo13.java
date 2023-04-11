/**
 * Created by Admin on 4/9/2023
 *
 * @author : Admin
 * @date : 4/9/2023
 * @project : Arrays Matrices and Collections
 */

/*Write a Java program that will generate the following array.*/

    /*
*     [1, 2, 3, 4, 5
*     2, 3, 4, 5, 1
*     3, 4, 5, 1, 2
*     4, 5, 1, 2, 3
*     5, 1, 2, 3, 4]
* */
public class TaskNo13 {
    //generate circulant matrix
    public static void circulant(int arr[], int n)
    {
        // Initializing an empty
        // 2D matrix of order n
        int c[][] = new int[n][n];
        for (int k = 0; k <= n - 1; k++)
            c[k][0] = arr[k];

        // Forming the circulant matrix
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (j - 1 >= 0)
                    c[j][i] = c[j - 1][i - 1];
                else
                    c[j][i] = c[n - 1][i - 1];
            }
        }

        // Displaying the circulant matrix
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        int A[] = { 1,2,3,4,5 };
        circulant(A, N);
    }
}
