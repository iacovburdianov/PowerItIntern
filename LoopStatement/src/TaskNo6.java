/*
* Write a program that checks if a number is "perfect,"
* that is, equal to the sum of its divisors, including 1. Perfect number is: 6, 28, 496…
* TestData: 6 = 1+2+3
* */
public class TaskNo6 {
    public static void main(String[] args) {
        System.out.println("Below are all perfect" +
                "numbers till 10000" + "\n1 is a perfect number");
        for (int n = 2; n < 10000; n++) {
            if (isPerfect(n)) {
                System.out.println(n +
                        " is a perfect number");
            }
        }
    }

    static boolean isPerfect(int n)
    {
        // To store sum of divisors
        int sum = 1;

        // Find all divisors and add them
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n && n != 1)
            return true;

        return false;
    }
}
