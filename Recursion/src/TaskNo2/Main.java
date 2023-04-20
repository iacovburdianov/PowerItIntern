package TaskNo2;

/**
 * Created by Admin on 4/18/2023
 *
 * @author : Admin
 * @date : 4/18/2023
 * @project : Recursion
 */

/*recursive method in Java that reads two numbers
 * N and X and determines the number of occurrences of the digit X in the natural number N.*/
public class Main {
    public static void main(String[] args) {
        int n = 1112300123;
        int k = 1;
        System.out.println(countDigits(n,k));
    }

    private static int countDigits(int n, int k) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        if (digit == k)
            return 1 + countDigits(n / 10,k);
        return countDigits(n/10,k);
    }
}
