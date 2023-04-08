import java.util.Scanner;

/*Write a program in Java to display the cube of the number upto given integer.*/
public class TaskNo1 {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println("Number is: " + i + " is : " + (i*i*i));
        }
    }
}
