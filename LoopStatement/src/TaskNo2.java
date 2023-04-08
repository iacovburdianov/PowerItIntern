import java.util.Scanner;
/*Write a program in Java to display the pattern like a right angle triangle with a number.*/
public class TaskNo2 {
    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i = 1;i <= n;i++)
        {
            for(j = 1;j <= i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
