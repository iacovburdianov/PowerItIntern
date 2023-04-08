/*Write a program that reads an X number
* from exactly 3 digits and generates the largest
* number that has the same digits as it.
*
* TestData: X = 186
* Expected Output: 861
* */


import java.util.Scanner;

public class TaskNo5 {
    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);

        int a, b, c;
        System.out.println("Please enter 3 digit number: ");
        final int num = in.nextInt();

        a = num / 100;
        b = (num / 10) % 10;
        c = num % 10;
        String s = Integer.toString(num);


        //find the biggest digit from number:
        if (a > b) {
            if (a > c) {
                System.out.print(a);
            } else {
                System.out.print(c);
            }
        } else {
            if (b > c) {
                System.out.print(b);
            } else {
                System.out.print(c);
            }
        }
        int middleNumber = middleOfThree(a,b,c);
        System.out.print(middleNumber);
        s = FindSmallestOfThree(s);
        System.out.print(s);

    }
    //find the middle of number:
    public static int middleOfThree(int a, int b,
                                    int c)
    {
        // Checking for b
        if ((a < b && b < c) || (c < b && b < a))
            return b;

            // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
            return a;

        else
            return c;
    }

    public static String FindSmallestOfThree(String s){
        if(s.length() <= 1)
            return s;
        String sFirstChar = s.substring(0,1);
        String sSecondChar = s.substring(1,2);
        int iFirst = Integer.parseInt(sFirstChar);
        int iSecond = Integer.parseInt(sSecondChar);

        if(iFirst < iSecond)
            return FindSmallestOfThree( sFirstChar + s.substring(2));
        else
            return FindSmallestOfThree(sSecondChar + s.substring(2));
    }
}
