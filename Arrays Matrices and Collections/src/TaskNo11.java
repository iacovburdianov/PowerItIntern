import java.util.Arrays;

/**
 * Created by Admin on 4/9/2023
 *
 * @author : Admin
 * @date : 4/9/2023
 * @project : Arrays Matrices and Collections
 */


/*
*
* Write a Java program that adds a line with the sum of the items in each column.
TestData: [
*           [2, 7, 9],
            [1, 4, 2],
            [0, 11, 5]
*                      ]
Expected Output:[ [2, 7, 9],
                  [1, 4, 2],
                  [0, 11, 5],
                  [3, 22, 16] ]*/
public class TaskNo11 {
    public static void main(String[] args) {
        int [][] a = {
                {2,7,9},
                {1,4,2},
                {0,11,5}};
        int [][] b = new int[4][3];
        //copying elements from array a[] to b[]

        for(int i = 0; i < a.length; i++){
            // allocation space to each row of arr2[]
            b[i] = new int[a[i].length];
            for(int j= 0; j<a[i].length; j++){
                b[i][j] = a[i][j];
            }
        }


        for (int i = 0; i < 3; i++) {
            b[3][i] = a[0][i]+ a[1][i] + a[2][i];
        }
        System.out.println("Show the elements of the new array: \n[");
        for (int i=0; i < b.length; i++){
            System.out.print("[");
            for (int j=0; j < b[0].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.print("],");
        }
        System.out.println("]");

    }
}
